package com.cinemaoperations.repository;

import com.cinemaoperations.constants.MovieSQLConstants;
import com.cinemaoperations.constants.SqlDataConnectionConstans;
import com.cinemaoperations.models.MovieAmountModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class MovieAmountRepository {

    public static List<MovieAmountModel> getAllMovieDataRepository(){
        List<MovieAmountModel> movieAmountModelsList = new ArrayList<>();
        try {
            ResultSet result = SqlDataConnectionConstans.getSqlDataConnectionStatement(MovieSQLConstants.getGetAllMovieDataSql());
            while (result.next()) {
                movieAmountModelsList.add(new MovieAmountModel(
                        result.getInt(1)
                        , result.getString(2)
                        , result.getInt(3)
                        , result.getDate(4)
                        , result.getInt(5)
                ));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return movieAmountModelsList;
    }

    public static boolean updateMovieDataRepository(MovieAmountModel movieAmountModel, int id){

        //  System.out.println("ID: " + SeatModel.getId() + " Status: " + SeatModel.getSeatStatus() + " MovieTime: "+ SeatModel.getMovieTime + " seat updated!");
        boolean isUpdated = false;
        try
        {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getUpdateMovieDataSql());
            statement.setInt(1, movieAmountModel.getId());
            statement.setString(2,movieAmountModel.getMovieName());
            statement.setInt(3, movieAmountModel.getAmount());
            statement.setDate(4, movieAmountModel.getExpireDate());
            statement.setInt(5, movieAmountModel.getMovie_time());
            statement.setInt(6, id);
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

    public static boolean insertMovieDataRepository(MovieAmountModel movieAmountModel){
//        System.out.println("ID: " + ogrenciModel.getId() + " Name: " + ogrenciModel.getName() + " ogrenci added!");
        boolean isOgrenciInserted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getInsertMovieDataSql());
            statement.setInt(1, movieAmountModel.getId());
            statement.setString(2,movieAmountModel.getMovieName());
            statement.setInt(3, movieAmountModel.getAmount());
            statement.setDate(4, movieAmountModel.getExpireDate());
            statement.setInt(5, movieAmountModel.getMovie_time());
            isOgrenciInserted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOgrenciInserted;
    }

    public static boolean deleteMovieDataRepository(int id){
        boolean isOgrenciDeleted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getDeleteMovieDataSql());
            statement.setInt(1, id);
            isOgrenciDeleted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isOgrenciDeleted;
    }

    public static MovieAmountModel getByIdMovieDataRepository(int id) {
        MovieAmountModel movieAmountModel = null;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getGetByIdMovieDataSql());
            statement.setLong(1, id);
            ResultSet  result =statement.executeQuery();
            result.next();
            movieAmountModel = new MovieAmountModel(
                      result.getInt(1)
                    , result.getString(2)
                    , result.getInt(3)
                    , result.getDate(4)
                    , result.getInt(5)
            );
            result.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return movieAmountModel;
    }
}
