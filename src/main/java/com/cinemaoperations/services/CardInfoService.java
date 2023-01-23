package com.cinemaoperations.services;

import com.cinemaoperations.CardInfoGetAllRequest;
import com.cinemaoperations.CardInfoGetAllResponse;
import com.cinemaoperations.CinemaOperationsServiceGrpc;
import com.cinemaoperations.converters.ConverterCardInfo;
import com.cinemaoperations.models.CardInfoModel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardInfoService {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

    @GrpcClient("card-info")
    CinemaOperationsServiceGrpc.CinemaOperationsServiceBlockingStub blockingStub;

    public  static String message;

    public List<CardInfoModel> getAllService() {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        CardInfoGetAllRequest request = CardInfoGetAllRequest.newBuilder().build();
        CardInfoGetAllResponse response = blockingStub.getAllCardInfo(request);
        return ConverterCardInfo.convertProtoCardInfoToModelCardInfoModelList(response.getCardInfoList());
    }
}
