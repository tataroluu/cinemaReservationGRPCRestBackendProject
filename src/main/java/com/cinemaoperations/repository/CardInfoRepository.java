package com.cinemaoperations.repository;

import com.cinemaoperations.constants.MovieSQLConstants;
import com.cinemaoperations.constants.SqlDataConnectionConstans;
import com.cinemaoperations.models.CardInfoModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class CardInfoRepository {

    public static List<CardInfoModel> getAllCardInfoRepository (){
        List<CardInfoModel> cardInfoModelList = new ArrayList<>();
        try {
            ResultSet result =SqlDataConnectionConstans.getSqlDataConnectionStatement(MovieSQLConstants.getGetAllCardInfoSql());
            while (result.next()){
                cardInfoModelList.add(new CardInfoModel(
                   result.getInt(1)
                   ,result.getString(2)
                   ,result.getLong(3)
                   ,result.getInt(4)
                   ,result.getInt(5)
                 ));
            }
            result.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
        return cardInfoModelList;
    }
}
