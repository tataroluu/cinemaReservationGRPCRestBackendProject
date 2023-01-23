package com.cinemaoperations.services;

import com.cinemaoperations.*;
import com.cinemaoperations.CanceledSalesMovieGetAllRequest;
import com.cinemaoperations.CanceledSalesMovieGetAllResponse;
import com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest;
import com.cinemaoperations.CinemaOperationsServiceGrpc;
import com.cinemaoperations.SalesMovieCancelRequest;
import com.cinemaoperations.SalesMovieDeleteRequest;
import com.cinemaoperations.SalesMovieDeleteResponse;
import com.cinemaoperations.SalesMovieGetAllRequest;
import com.cinemaoperations.SalesMovieGetAllResponse;
import com.cinemaoperations.SalesMovieInsertRequest;
import com.cinemaoperations.SalesMovieInsertResponse;
import com.cinemaoperations.converters.ConverterSalesMovie;
import com.cinemaoperations.models.SalesMovieModel;
import com.cinemaoperations.repository.SalesMovieRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesMovieService {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

    @GrpcClient("sales-movie")
    CinemaOperationsServiceGrpc.CinemaOperationsServiceBlockingStub blockingStub;

    public static String message;

    public List<SalesMovieModel> getAllService() {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        SalesMovieGetAllRequest request = SalesMovieGetAllRequest.newBuilder().build();
        SalesMovieGetAllResponse response = blockingStub.getAllSalesMovie(request);
        return ConverterSalesMovie.convertProtoSalesMovieToModelSalesMovieModelList(response.getSalesMovieList());
    }

    public SalesMovieModel getByIdService(int id) {
        return SalesMovieRepository.getByIdSalesMovieRepository(id);
    }

    public boolean deleteService(int id) {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        SalesMovieDeleteRequest request = SalesMovieDeleteRequest.newBuilder().setId(id).build();
         SalesMovieDeleteResponse response = blockingStub.deleteSalesMovie(request);
        return response.getIsDelete();
    }

    public boolean insertService(SalesMovieModel salesMovieModel) {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        com.cinemaoperations.SalesMovie protoSalesMovie = ConverterSalesMovie.convertModelSalesMovieToProtoSalesMovie(salesMovieModel);
        SalesMovieInsertRequest request = SalesMovieInsertRequest.newBuilder().setSalesMovie(protoSalesMovie).build();
        SalesMovieInsertResponse response = blockingStub.insertSalesMovie(request);
        return response.getIsSaved();
    }

    public boolean cancelService(int id) {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        com.cinemaoperations.SalesMovieCancelRequest request = SalesMovieCancelRequest.newBuilder().setId(id).build();
        com.cinemaoperations.SalesMovieCancelResponse response = blockingStub.cancelSalesMovie(request);
        return response.getIsCanceled();
    }

    public List<SalesMovieModel> getAllCanceledService() {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        com.cinemaoperations.CanceledSalesMovieGetAllRequest request = CanceledSalesMovieGetAllRequest.newBuilder().build();
        CanceledSalesMovieGetAllResponse response = blockingStub.canceledGetAllSalesMovie(request);
        return ConverterSalesMovie.convertProtoSalesMovieToModelSalesMovieModelList(response.getSalesMovieList());
    }

    public boolean changedCanceledService() {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest request = ChangedAllCanceledSalesMovieGetAllRequest.newBuilder().build();
        com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse response = blockingStub.changedAllCanceledSalesMovie(request);
        return response.getIsCanceled();
    }

    public boolean deletedAllCanceledService() {
        blockingStub = CinemaOperationsServiceGrpc.newBlockingStub(channel);
        com.cinemaoperations.DeleteAllCanceledSalesMovieRequest request = com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.newBuilder().build();
        com.cinemaoperations.DeleteAllChangeledSalesMovieResponse response = blockingStub.deleteAllCanceledSalesMovie(request);
        return response.getIsDeletedAllChanged();
    }
}

