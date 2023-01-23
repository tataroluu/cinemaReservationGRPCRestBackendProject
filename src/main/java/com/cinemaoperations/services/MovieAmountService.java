package com.cinemaoperations.services;

  import com.cinemaoperations.*;
  import com.cinemaoperations.CinemaOperationsServiceGrpc;
  import com.cinemaoperations.MovieAmount;
  import com.cinemaoperations.MovieAmountDeleteRequest;
  import com.cinemaoperations.MovieAmountGetAllRequest;
  import com.cinemaoperations.MovieAmountGetAllResponse;
  import com.cinemaoperations.MovieAmountInsertRequest;
  import com.cinemaoperations.MovieAmountInsertResponse;
  import com.cinemaoperations.MovieAmountUpdateRequest;
  import com.cinemaoperations.MovieAmountUpdateResponse;
  import com.cinemaoperations.converters.ConverterMovieAmount;
import com.cinemaoperations.models.MovieAmountModel;
import com.cinemaoperations.repository.MovieAmountRepository;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
 import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieAmountService {

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost" ,9090).usePlaintext().build();

    @GrpcClient("movie-amount-service")
    CinemaOperationsServiceGrpc.CinemaOperationsServiceBlockingStub blockingStub;

    CinemaOperationsServiceGrpc serviceGrpc;

    public MovieAmountModel getByIdMovieDataService(int id) {
        return MovieAmountRepository.getByIdMovieDataRepository(id);
    }

    public List<MovieAmountModel> getAllService() {
        blockingStub = serviceGrpc.newBlockingStub(channel);
        MovieAmountGetAllRequest request = MovieAmountGetAllRequest.newBuilder().build();
        MovieAmountGetAllResponse response = blockingStub.getAllMovieAmount(request);
        return ConverterMovieAmount.convertProtoMovieAmountToModelMovieAmountModelList(response.getMovieAmountList());
    }

    public boolean deleteService(int id) {
        blockingStub = serviceGrpc.newBlockingStub(channel);
       MovieAmountDeleteRequest request = MovieAmountDeleteRequest.newBuilder().setId(id).build();
        com.cinemaoperations.MovieAmountDeleteResponse response = blockingStub.deleteMovieAmount(request);
        return response.getIsDelete();
    }

    public boolean insertService(MovieAmountModel movieAmountModel) {
        blockingStub = serviceGrpc.newBlockingStub(channel);
        com.cinemaoperations.MovieAmount protoMovieAmount = ConverterMovieAmount.convertModelMovieAmountToProtoMovieAmount(movieAmountModel);
        MovieAmountInsertRequest request = MovieAmountInsertRequest.newBuilder().setMovieAmount(protoMovieAmount).build();
        MovieAmountInsertResponse response = blockingStub.insertMovieAmount(request);
        return response.getIsSaved();
    }

    public MovieAmountModel getByIdService(int id) {
        return MovieAmountRepository.getByIdMovieDataRepository(id);
    }

    public boolean updateService(MovieAmountModel movieAmountModel, int id) {
        blockingStub = serviceGrpc.newBlockingStub(channel);
        MovieAmount protoOgrenci = ConverterMovieAmount.convertModelMovieAmountToProtoMovieAmount(movieAmountModel);
        MovieAmountUpdateRequest request = MovieAmountUpdateRequest.
                newBuilder().setMovieAmount(protoOgrenci).setId(id).build();
        MovieAmountUpdateResponse response = blockingStub.updateMovieAmount(request);
        boolean isSaved = response.getIsUpdated();
        return isSaved;
    }

}
