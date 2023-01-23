package com.cinemaoperations.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MovieAmountModel {

    private int id;
    private String movieName;
    private int amount;
    private Date expireDate;
    private int movie_time;
}
