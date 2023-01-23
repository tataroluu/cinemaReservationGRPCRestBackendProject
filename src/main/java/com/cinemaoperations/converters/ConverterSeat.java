package com.cinemaoperations.converters;

import com.cinemaoperations.Seat;
import com.cinemaoperations.models.SeatModel;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class ConverterSeat {

    public static @NotNull List<Seat> convertSeatModelListToProtoSeatList(List<SeatModel> seatModelList) {
        List<Seat> protoOgrenciList = new ArrayList<>();
        for (SeatModel seatModel : seatModelList)
        {
            protoOgrenciList.add(Seat.newBuilder()
                    .setId(seatModel.getId())
                    .setSeatStatus(seatModel.isSeatStatus())
                    .build());
        }
        return protoOgrenciList;
    }

    public static SeatModel convertProtoSeatToSeatModel(Seat protoSeat) {
        SeatModel seatModel = new SeatModel();
        seatModel.setId((int) protoSeat.getId());
        seatModel.setSeatStatus(protoSeat.getSeatStatus());
        return seatModel;
    }


    public static List<SeatModel> convertProtoSeatToModelSeatModelList(List<Seat> seatList) {
        List<SeatModel> protoSeatList = new ArrayList<>();
        for (Seat protoSeat : seatList) {
            SeatModel seatModel = new SeatModel();
            seatModel.setId((int) protoSeat.getId());
            seatModel.setSeatStatus(protoSeat.getSeatStatus());
            protoSeatList.add(seatModel);
        }
        return protoSeatList;
    }

    public static Seat convertModelSeatModelToProtoSeat(SeatModel seatModel) {
        return Seat.newBuilder()
                .setId(seatModel.getId())
                .setSeatStatus(seatModel.isSeatStatus())
                .build();
    }
}
