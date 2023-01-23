package com.cinemaoperations.converters;

import com.cinemaoperations.SalesMovie;
import com.cinemaoperations.models.SalesMovieModel;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ConverterSalesMovie {

    public static List<SalesMovieModel> convertProtoSalesMovieToModelSalesMovieModelList(List<SalesMovie> salesMovieList) {
        List<SalesMovieModel> protoSalesMovieList = new ArrayList<>();
        for (SalesMovie protoSalesMovie : salesMovieList) {
            SalesMovieModel salesMovieModel = new SalesMovieModel();
            salesMovieModel.setId((int) protoSalesMovie.getId());
            salesMovieModel.setMovieName(protoSalesMovie.getMovieName());
            salesMovieModel.setCustomerName(protoSalesMovie.getCustomerName());
            salesMovieModel.setSeatCount((int) protoSalesMovie.getSeatCount());
            salesMovieModel.setTotalPrice((int) protoSalesMovie.getTotalPrice());
            salesMovieModel.set_canceled(protoSalesMovie.getIsCanceled());
            salesMovieModel.setSaleDate(protoSalesMovie.getSaleDate());
            protoSalesMovieList.add(salesMovieModel);
        }
        return protoSalesMovieList;
    }

    public static SalesMovie convertModelSalesMovieToProtoSalesMovie(SalesMovieModel salesMovieModel) {
        return SalesMovie.newBuilder()
                .setMovieName(salesMovieModel.getMovieName())
                .setCustomerName(salesMovieModel.getCustomerName())
                .setSeatCount(salesMovieModel.getSeatCount())
                .setTotalPrice(salesMovieModel.getTotalPrice())
                .setSaleDate(String.valueOf(salesMovieModel.getSaleDate()))
                .build();
    }

    public static List<SalesMovie> convertProtoSalesMovieListToSalesMovieModelList(List<SalesMovieModel> salesMovieModelList) {
        List<SalesMovie> protoSalesMovieList = new ArrayList<>();
        for (SalesMovieModel salesMovieModel : salesMovieModelList) {
            protoSalesMovieList.add(SalesMovie.newBuilder()
                    .setId(salesMovieModel.getId())
                    .setMovieName(salesMovieModel.getMovieName())
                    .setCustomerName(salesMovieModel.getCustomerName())
                    .setSeatCount(salesMovieModel.getSeatCount())
                    .setTotalPrice(salesMovieModel.getTotalPrice())
                    .setIsCanceled(salesMovieModel.is_canceled())
                    .setSaleDate(String.valueOf(salesMovieModel.getSaleDate()))
                    .build());
        }
        return protoSalesMovieList;
    }

    public static SalesMovieModel convertProtoSalesMovieToModelSalesMovieModel(SalesMovie protoSalesMovie) {
        SalesMovieModel salesMovieModel = new SalesMovieModel();
        salesMovieModel.setMovieName(protoSalesMovie.getMovieName());
        salesMovieModel.setCustomerName(protoSalesMovie.getCustomerName());
        salesMovieModel.setSeatCount((int) protoSalesMovie.getSeatCount());
        salesMovieModel.setTotalPrice((int) protoSalesMovie.getTotalPrice());
        salesMovieModel.setSaleDate(protoSalesMovie.getSaleDate());
        return salesMovieModel;
    }
}
