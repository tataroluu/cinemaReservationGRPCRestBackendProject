package com.cinemaoperations.converters;

import com.cinemaoperations.CardInfo;
import com.cinemaoperations.models.CardInfoModel;

import java.util.ArrayList;
import java.util.List;

public class ConverterCardInfo {


    public static List<CardInfoModel> convertProtoCardInfoToModelCardInfoModelList(List<CardInfo> cardInfoList) {
        List<CardInfoModel> protoCardInfoList = new ArrayList<>();
        for (CardInfo protoCardInfo : cardInfoList) {
            CardInfoModel cardInfoModel = new CardInfoModel();
             cardInfoModel.setCardOwnerName(protoCardInfo.getCardOwnerName());
            cardInfoModel.setCardNumber(protoCardInfo.getCardNumber());
            cardInfoModel.setExpiration((int) protoCardInfo.getExpiration());
            cardInfoModel.setCvv((int) protoCardInfo.getCvv());
            protoCardInfoList.add(cardInfoModel);
        }
        return protoCardInfoList;
    }

    public static List<CardInfo> convertCardInfoListToProtoCardInfoModelList(List<CardInfoModel> cardInfoModelList) {
        List<CardInfo> protoCardInfoList = new ArrayList<>();
        for (CardInfoModel cardInfoModel : cardInfoModelList)
        {
            protoCardInfoList.add(CardInfo.newBuilder()
                    .setId(cardInfoModel.getId())
                    .setCardOwnerName(cardInfoModel.getCardOwnerName())
                    .setCardNumber(cardInfoModel.getCardNumber())
                    .setExpiration(cardInfoModel.getExpiration())
                    .setCvv(cardInfoModel.getCvv())
                    .build());
        }
        return protoCardInfoList;
    }
}
