package com.cinemaoperations.services;

import com.cinemaoperations.CinemaOperationsServiceGrpc;
import com.cinemaoperations.Seat;
import com.cinemaoperations.SeatGetAllRequest;
import com.cinemaoperations.SeatUpdateResponse;
import com.cinemaoperations.converters.ConverterSeat;
import com.cinemaoperations.models.SeatModel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();

    @GrpcClient("seat-service")
    CinemaOperationsServiceGrpc.CinemaOperationsServiceBlockingStub blockingStub;

    public static String message;

    CinemaOperationsServiceGrpc serviceGrpc;

    public  List<SeatModel> getAllService() {
        blockingStub  = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        SeatGetAllRequest request = SeatGetAllRequest.newBuilder().build();
        com.cinemaoperations.SeatGetAllResponse response = blockingStub.getAllSeat(request);
        return ConverterSeat.convertProtoSeatToModelSeatModelList(response.getSeatList());
    }

    public boolean updateService(SeatModel ogrenciModel, int id) {
        blockingStub = serviceGrpc.newBlockingStub(channel);
        Seat protoOgrenci = ConverterSeat.convertModelSeatModelToProtoSeat(ogrenciModel);
        com.cinemaoperations.SeatUpdateRequest request = com.cinemaoperations.SeatUpdateRequest.newBuilder().setSeat(protoOgrenci).setId(id).build();
        SeatUpdateResponse response = blockingStub.updateSeatStatus(request);
        boolean isSaved = response.getIsUpdated();
        return isSaved;
    }
}
