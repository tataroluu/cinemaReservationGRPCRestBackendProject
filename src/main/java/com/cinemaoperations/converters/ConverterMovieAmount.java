package com.cinemaoperations.converters;

import com.cinemaoperations.MovieAmount;
import com.cinemaoperations.models.MovieAmountModel;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ConverterMovieAmount {

    public static List<MovieAmount> convertMovieAmountListToProtoMovieAmountModelList(List<MovieAmountModel> movieAmountModelList) {
        List<MovieAmount> protoMovieAmountList = new ArrayList<>();
        for (MovieAmountModel movieAmountModel : movieAmountModelList)
        {
            protoMovieAmountList.add(MovieAmount.newBuilder()
                    .setId(movieAmountModel.getId())
                    .setMovieName(movieAmountModel.getMovieName())
                    .setAmount(movieAmountModel.getAmount())
                    .setExpireDate(String.valueOf(movieAmountModel.getExpireDate()))
                    .setMovieTime(movieAmountModel.getMovie_time())
                      .build());
        }
        return protoMovieAmountList;
    }

    public static MovieAmountModel convertProtoMovieAmountToModelMovieAmountModel(MovieAmount protoMovieAmount) {
        MovieAmountModel movieAmountModel = new MovieAmountModel();
        movieAmountModel.setId((int) protoMovieAmount.getId());
        movieAmountModel.setMovieName(protoMovieAmount.getMovieName());
        movieAmountModel.setAmount((int) protoMovieAmount.getAmount());
        movieAmountModel.setExpireDate(Date.valueOf(protoMovieAmount.getExpireDate()));
        movieAmountModel.setMovie_time((int) protoMovieAmount.getMovieTime());
         return movieAmountModel;
    }

    public static List<MovieAmountModel> convertProtoMovieAmountToModelMovieAmountModelList(List<MovieAmount> movieAmountList) {
        List<MovieAmountModel> protoMovieAmountList = new ArrayList<>();
        for (MovieAmount protoMovieAmount : movieAmountList) {
            MovieAmountModel movieAmountModel = new MovieAmountModel();
            movieAmountModel.setId((int) protoMovieAmount.getId());
            movieAmountModel.setMovieName(protoMovieAmount.getMovieName());
            movieAmountModel.setAmount((int) protoMovieAmount.getAmount());
            movieAmountModel.setExpireDate(Date.valueOf(protoMovieAmount.getExpireDate()));
            movieAmountModel.setMovie_time((int) protoMovieAmount.getMovieTime());
              protoMovieAmountList.add(movieAmountModel);
        }
        return protoMovieAmountList;
    }

    public static MovieAmount convertModelMovieAmountToProtoMovieAmount(MovieAmountModel movieAmountModel) {
        return MovieAmount.newBuilder()
                 .setId(movieAmountModel.getId())
                .setMovieName(movieAmountModel.getMovieName())
                .setAmount(movieAmountModel.getAmount())
                .setExpireDate(String.valueOf(movieAmountModel.getExpireDate()))
                .setMovieTime(movieAmountModel.getMovie_time())
                 .build();
    }

}
