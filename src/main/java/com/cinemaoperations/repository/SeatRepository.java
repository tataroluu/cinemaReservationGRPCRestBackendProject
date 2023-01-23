package com.cinemaoperations.repository;

import com.cinemaoperations.constants.MovieSQLConstants;
import com.cinemaoperations.constants.SqlDataConnectionConstans;
import lombok.AllArgsConstructor;
import com.cinemaoperations.models.SeatModel;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class SeatRepository {

    public static List<SeatModel> getAllSeatRepository(){
        List<SeatModel> seatModelList= new ArrayList<>();
        try {
            ResultSet result = SqlDataConnectionConstans.getSqlDataConnectionStatement(MovieSQLConstants.getGetAllSeatsSql());
            while (result.next()) {
                seatModelList.add(new SeatModel(
                         result.getInt(1)
                        , result.getBoolean(2)
                ));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return seatModelList;
    }
    public static boolean updateSeatStatusRepository(SeatModel seatModel, int id){
      //  System.out.println("ID: " + SeatModel.getId() + " Status: " + SeatModel.getSeatStatus() + " MovieTime: "+ SeatModel.getMovieTime + " seat updated!");
        boolean isUpdated = false;
        try
        {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getUpdateStatusSeatsSql());
            statement.setBoolean(1,seatModel.isSeatStatus());
            statement.setInt(2, id);
            isUpdated = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return isUpdated;
    }


}
