package com.cinemaoperations;


 import com.cinemaoperations.converters.ConverterCardInfo;
 import com.cinemaoperations.converters.ConverterMovieAmount;
 import com.cinemaoperations.converters.ConverterSalesMovie;
 import com.cinemaoperations.converters.ConverterSeat;
 import com.cinemaoperations.models.*;
 import com.cinemaoperations.repository.CardInfoRepository;
 import com.cinemaoperations.repository.MovieAmountRepository;
 import com.cinemaoperations.repository.SalesMovieRepository;
 import com.cinemaoperations.repository.SeatRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.List;

@GrpcService
public class MovieOperationsServiceGRPC extends com.cinemaoperations.CinemaOperationsServiceGrpc.CinemaOperationsServiceImplBase {

    @Override
    public void getAllSeat(com.cinemaoperations.SeatGetAllRequest request, StreamObserver<com.cinemaoperations.SeatGetAllResponse> responseObserver) {
        List<SeatModel> seatModelList = SeatRepository.getAllSeatRepository();
        List<com.cinemaoperations.Seat> protoSeat = ConverterSeat.convertSeatModelListToProtoSeatList(seatModelList);
        com.cinemaoperations.SeatGetAllResponse seatGetAllResponse = com.cinemaoperations.SeatGetAllResponse.newBuilder().addAllSeat(protoSeat).build();
        responseObserver.onNext(seatGetAllResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateSeatStatus(com.cinemaoperations.SeatUpdateRequest request, StreamObserver<com.cinemaoperations.SeatUpdateResponse> responseObserver) {
        com.cinemaoperations.Seat protoSeat = request.getSeat();
        SeatModel seatModel = ConverterSeat.convertProtoSeatToSeatModel(protoSeat);
        boolean isSaved = SeatRepository.updateSeatStatusRepository(seatModel, request.getId());
        com.cinemaoperations.SeatUpdateResponse response = com.cinemaoperations.SeatUpdateResponse.newBuilder().setIsUpdated(isSaved).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void getAllMovieAmount(com.cinemaoperations.MovieAmountGetAllRequest request, StreamObserver<com.cinemaoperations.MovieAmountGetAllResponse> responseObserver) {
        List<MovieAmountModel> movieAmountModelList = MovieAmountRepository.getAllMovieDataRepository();
        List<com.cinemaoperations.MovieAmount> protoMovieAmountModelList = ConverterMovieAmount.convertMovieAmountListToProtoMovieAmountModelList(movieAmountModelList);
        com.cinemaoperations.MovieAmountGetAllResponse movieAmountGetAllResponse = com.cinemaoperations.MovieAmountGetAllResponse.newBuilder().addAllMovieAmount(protoMovieAmountModelList).build();
        responseObserver.onNext(movieAmountGetAllResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void updateMovieAmount(com.cinemaoperations.MovieAmountUpdateRequest request, StreamObserver<com.cinemaoperations.MovieAmountUpdateResponse> responseObserver) {
        com.cinemaoperations.MovieAmount protoMovieAmount = request.getMovieAmount();
        MovieAmountModel movieAmountModel = ConverterMovieAmount.convertProtoMovieAmountToModelMovieAmountModel(protoMovieAmount);
        boolean isSaved = MovieAmountRepository.updateMovieDataRepository(movieAmountModel, request.getId());
        com.cinemaoperations.MovieAmountUpdateResponse response = com.cinemaoperations.MovieAmountUpdateResponse.newBuilder().setIsUpdated(isSaved).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void insertMovieAmount(com.cinemaoperations.MovieAmountInsertRequest request, StreamObserver<com.cinemaoperations.MovieAmountInsertResponse> responseObserver) {
        com.cinemaoperations.MovieAmount protoMovieAmount = request.getMovieAmount();
        MovieAmountModel movieAmountModel = ConverterMovieAmount.convertProtoMovieAmountToModelMovieAmountModel(protoMovieAmount);
        boolean isSaved = MovieAmountRepository.insertMovieDataRepository(movieAmountModel);
        com.cinemaoperations.MovieAmountInsertResponse Response = com.cinemaoperations.MovieAmountInsertResponse.newBuilder().setIsSaved(isSaved).build();
        responseObserver.onNext(Response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteMovieAmount(com.cinemaoperations.MovieAmountDeleteRequest request, StreamObserver<com.cinemaoperations.MovieAmountDeleteResponse> responseObserver) {
        boolean isdeleted = MovieAmountRepository.deleteMovieDataRepository(request.getId());
        com.cinemaoperations.MovieAmountDeleteResponse response = com.cinemaoperations.MovieAmountDeleteResponse.newBuilder().setIsDelete(isdeleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void getAllCardInfo(com.cinemaoperations.CardInfoGetAllRequest request, StreamObserver<com.cinemaoperations.CardInfoGetAllResponse> responseObserver) {
        List<CardInfoModel> cardInfoModelList = CardInfoRepository.getAllCardInfoRepository();
        List<com.cinemaoperations.CardInfo> protoCardInfoModelList = ConverterCardInfo.convertCardInfoListToProtoCardInfoModelList(cardInfoModelList);
        com.cinemaoperations.CardInfoGetAllResponse cardInfoGetAllResponse = com.cinemaoperations.CardInfoGetAllResponse.newBuilder().addAllCardInfo(protoCardInfoModelList).build();
        responseObserver.onNext(cardInfoGetAllResponse);
        responseObserver.onCompleted();
    }


    @Override
    public void getAllSalesMovie(com.cinemaoperations.SalesMovieGetAllRequest request, StreamObserver<com.cinemaoperations.SalesMovieGetAllResponse> responseObserver) {
        List<SalesMovieModel> salesMovieModelList = SalesMovieRepository.getAllSalesMovieRepository();
        List<com.cinemaoperations.SalesMovie> protoSalesMovieModelList = ConverterSalesMovie.convertProtoSalesMovieListToSalesMovieModelList(salesMovieModelList);
        com.cinemaoperations.SalesMovieGetAllResponse salesMovieGetAllResponse = com.cinemaoperations.SalesMovieGetAllResponse.newBuilder().addAllSalesMovie(protoSalesMovieModelList).build();
        responseObserver.onNext(salesMovieGetAllResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void insertSalesMovie(com.cinemaoperations.SalesMovieInsertRequest request, StreamObserver<com.cinemaoperations.SalesMovieInsertResponse> responseObserver) {
        com.cinemaoperations.SalesMovie protoSalesMovie = request.getSalesMovie();
        SalesMovieModel salesMovieModel = ConverterSalesMovie.convertProtoSalesMovieToModelSalesMovieModel(protoSalesMovie);
        boolean isSaved = SalesMovieRepository.insertSalesMovieRepository(salesMovieModel);
        com.cinemaoperations.SalesMovieInsertResponse Response = com.cinemaoperations.SalesMovieInsertResponse.newBuilder().setIsSaved(isSaved).build();
        responseObserver.onNext(Response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteSalesMovie(com.cinemaoperations.SalesMovieDeleteRequest request, StreamObserver<com.cinemaoperations.SalesMovieDeleteResponse> responseObserver) {
        boolean isdeleted = SalesMovieRepository.deleteSalesMovieModelRepository(request.getId());
        com.cinemaoperations.SalesMovieDeleteResponse response = com.cinemaoperations.SalesMovieDeleteResponse.newBuilder().setIsDelete(isdeleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void cancelSalesMovie(com.cinemaoperations.SalesMovieCancelRequest request, StreamObserver<com.cinemaoperations.SalesMovieCancelResponse> responseObserver) {
        boolean isCanceled = SalesMovieRepository.canceledSalesMovieRepository(request.getId());
        com.cinemaoperations.SalesMovieCancelResponse response = com.cinemaoperations.SalesMovieCancelResponse.newBuilder().setIsCanceled(isCanceled).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void canceledGetAllSalesMovie(com.cinemaoperations.CanceledSalesMovieGetAllRequest request, StreamObserver<com.cinemaoperations.CanceledSalesMovieGetAllResponse> responseObserver) {
        List<SalesMovieModel> salesMovieModelList = SalesMovieRepository.getAllCanceledSalesMovieRepository();
        List<com.cinemaoperations.SalesMovie> protoSalesMovieModelList = ConverterSalesMovie.convertProtoSalesMovieListToSalesMovieModelList(salesMovieModelList);
        com.cinemaoperations.CanceledSalesMovieGetAllResponse salesMovieGetAllResponse = com.cinemaoperations.CanceledSalesMovieGetAllResponse.newBuilder().addAllSalesMovie(protoSalesMovieModelList).build();
        responseObserver.onNext(salesMovieGetAllResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void changedAllCanceledSalesMovie(com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest request, StreamObserver<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> responseObserver) {
        boolean isChanged = SalesMovieRepository.changedAllCanceledSalesMovieRepository();
        com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse response = com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse.newBuilder().setIsCanceled(isChanged).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
     }

    @Override
    public void deleteAllCanceledSalesMovie(com.cinemaoperations.DeleteAllCanceledSalesMovieRequest request, StreamObserver<com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> responseObserver) {
        boolean isDeleted = SalesMovieRepository.deleteAllCanceledSalesMovieRepository();
        com.cinemaoperations.DeleteAllChangeledSalesMovieResponse response = com.cinemaoperations.DeleteAllChangeledSalesMovieResponse.newBuilder().setIsDeletedAllChanged(isDeleted).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

