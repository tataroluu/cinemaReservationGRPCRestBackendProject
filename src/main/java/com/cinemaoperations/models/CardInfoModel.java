package com.cinemaoperations.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardInfoModel {

    private int id;
    private String cardOwnerName;
    private long cardNumber;
    private int expiration;
    private int cvv;
}
