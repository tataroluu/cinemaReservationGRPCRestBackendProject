package com.cinemaoperations.models;

import lombok.*;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
 public class SalesMovieModel {

    private int id;
    private String movieName;
    private String customerName;
    private int seatCount;
    private int totalPrice;
    private boolean is_canceled;
    private String saleDate;

}
