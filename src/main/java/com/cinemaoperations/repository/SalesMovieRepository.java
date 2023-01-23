package com.cinemaoperations.repository;

import com.cinemaoperations.constants.MovieSQLConstants;
import com.cinemaoperations.constants.SqlDataConnectionConstans; 
import com.cinemaoperations.models.SalesMovieModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
@AllArgsConstructor
public class SalesMovieRepository {

    public static List<SalesMovieModel> getAllSalesMovieRepository(){
        List<SalesMovieModel> salesMovieModelList = new ArrayList<>();
        try {
            ResultSet result = SqlDataConnectionConstans.getSqlDataConnectionStatement(MovieSQLConstants.getGetAllSalesMovieSql());
            while (result.next()) {
                salesMovieModelList.add(new SalesMovieModel(
                          result.getInt(1),
                         result.getString(2)
                        , result.getString(3)
                        , result.getInt(4)
                        , result.getInt(5)
                        , result.getBoolean(6)
                        , result.getString(7)
                ));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return salesMovieModelList;
    }

    public static boolean insertSalesMovieRepository(SalesMovieModel salesMovieModel){
//        System.out.println("ID: " + salesMovieModel.getId() + " Name: " + salesMovieModel.getName() + " Sales Movie added!");
        boolean isInserted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getInsertSalesMovieSql());
             statement.setString(1,salesMovieModel.getMovieName());
            statement.setString(2, salesMovieModel.getCustomerName());
            statement.setInt(3, salesMovieModel.getSeatCount());
            statement.setInt(4, salesMovieModel.getTotalPrice());
            statement.setBoolean(5, salesMovieModel.is_canceled());
            statement.setString(6, salesMovieModel.getSaleDate());
            isInserted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isInserted;
    }

    public static boolean deleteSalesMovieModelRepository(int id){
        boolean isDeleted = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getDeleteSalesMovieSql());
            statement.setInt(1, id);
            isDeleted = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleted;
    }

    public static SalesMovieModel getByIdSalesMovieRepository(int id) {
        SalesMovieModel salesMovieModel = null;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getGetByIdSeatsSql());
            statement.setLong(1, id);
            ResultSet  result =statement.executeQuery();
            result.next();
            salesMovieModel = new SalesMovieModel(
                      result.getInt(1)
                     ,result.getString(2)
                    , result.getString(3)
                    , result.getInt(4)
                    , result.getInt(5)
                    , result.getBoolean(6)
                    , result.getString(7)
            );
            result.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return salesMovieModel;
    }

    public static boolean canceledSalesMovieRepository(int id){
        boolean isCanceled = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getCanceledByIdSalesMovieSql());
            statement.setInt(1, id);
            isCanceled = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCanceled;
    }

    public static List<SalesMovieModel> getAllCanceledSalesMovieRepository(){
        List<SalesMovieModel> salesMovieModelList = new ArrayList<>();
        try {
            ResultSet result = SqlDataConnectionConstans.getSqlDataConnectionStatement(MovieSQLConstants.getGetAllCanceledSalesMovieSql());
            while (result.next()) {
                salesMovieModelList.add(new SalesMovieModel(
                          result.getInt(1)
                        , result.getString(2)
                        , result.getString(3)
                        , result.getInt(4)
                        , result.getInt(5)
                        , result.getBoolean(6)
                        , result.getString(7)

                ));
            }
            result.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return salesMovieModelList;
    }

    public static boolean changedAllCanceledSalesMovieRepository(){
        boolean isCanceled = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getChangeAllCanceledSalesMovieSql());
            isCanceled = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isCanceled;
    }

    public static boolean deleteAllCanceledSalesMovieRepository(){
        boolean isDeleteAll = false;
        try {
            Connection connection= SqlDataConnectionConstans.getSqlDataConnection();
            PreparedStatement statement= SqlDataConnectionConstans.getSqlDataPreparedStatement(MovieSQLConstants.getDeleteAllSalesMovieSql());
            isDeleteAll = statement.executeUpdate() > 0;
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isDeleteAll;
    }
}
