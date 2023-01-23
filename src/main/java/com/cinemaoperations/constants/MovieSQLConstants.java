package com.cinemaoperations.constants;


public class MovieSQLConstants {

    //cinema SQL Constains
    public static final String GET_ALL_SEATS_SQL = "SELECT * FROM cinema.seat ORDER BY id ASC";
    public static final String GET_BY_ID_SEATS_SQL = "SELECT * FROM cinema.seat where id=? ORDER BY id ASC";
    public static final String UPDATE_STATUS_SEATS_SQL = "UPDATE cinema.Seat SET seat_status=? WHERE id=?";

    public  static final  String GET_ALL_MOVIE_DATA_SQL = "SELECT * FROM cinema.Movie_Amount  ORDER BY id ASC ";
    public  static final  String UPDATE_MOVIE_DATA_SQL = "UPDATE cinema.movie_amount SET id=?, movie_name=?, amount=?, expire_date=?, movie_time=? WHERE id=?";
    public  static final  String INSERT_MOVIE_DATA_SQL   = "INSERT INTO cinema.movie_amount(id, movie_name, amount, expire_date, movie_time) VALUES (?, ?, ?, ?, ?)";
    public  static final  String DELETE_MOVIE_DATA_SQL   = "DELETE FROM cinema.movie_amount WHERE id=?";
    public  static final  String GET_BY_ID_MOVIE_DATA_SQL   = "SELECT * from cinema.movie_amount WHERE id=?";

    public  static final  String GET_ALL_CARD_INFO_SQL   = "SELECT * from cinema.card_info order by id asc ";

    public  static final  String GET_ALL_SALES_MOVİE_SQL   = "SELECT * FROM cinema.sales_movie where is_canceled='true' ORDER BY id ASC";
    public  static final  String DELETE_SALES_MOVİE_SQL  = "DELETE FROM cinema.sales_movie WHERE id=?";
    public  static final  String INSERT_SALES_MOVİE_SQL   = "INSERT INTO cinema.sales_movie( movie_name, customer_name, seat_count, total_price, is_canceled, sale_date) VALUES ( ?, ?, ?, ?, ?, ?)";
    public  static final  String CANCELED_BY_ID_SALES_MOVİE_SQL   = "UPDATE cinema.sales_movie SET is_canceled='true' WHERE id=?";
    public  static final  String GET_ALL_CANCELED_SALES_MOVİE_SQL    = "SELECT * FROM cinema.sales_movie where is_canceled='false' ORDER BY id ASC";
    public  static final  String CHANGE_ALL_CANCELED_SALES_MOVİE_SQL    = "UPDATE cinema.sales_movie SET is_canceled='true' where is_canceled='false' ";
    public  static final  String DELETE_ALL_SALES_MOVİE_SQL  = "DELETE FROM cinema.sales_movie";


//    Get Methods for cinema
    public static String getGetAllSeatsSql() {return  GET_ALL_SEATS_SQL;}
    public static String getGetByIdSeatsSql() {return  GET_BY_ID_SEATS_SQL;}
    public static String getUpdateStatusSeatsSql(){return UPDATE_STATUS_SEATS_SQL;}

    public static String getGetAllMovieDataSql(){return  GET_ALL_MOVIE_DATA_SQL;}
    public static String getUpdateMovieDataSql(){return  UPDATE_MOVIE_DATA_SQL;}
    public static String getInsertMovieDataSql(){return  INSERT_MOVIE_DATA_SQL;}
    public static String getDeleteMovieDataSql(){return  DELETE_MOVIE_DATA_SQL;}
    public static String getGetByIdMovieDataSql(){return  GET_BY_ID_MOVIE_DATA_SQL;}

    public static String getGetAllCardInfoSql(){return GET_ALL_CARD_INFO_SQL;}

    public static String  getGetAllSalesMovieSql(){return GET_ALL_SALES_MOVİE_SQL;}
    public static String getDeleteSalesMovieSql(){return DELETE_SALES_MOVİE_SQL;}
    public static String getInsertSalesMovieSql(){return INSERT_SALES_MOVİE_SQL;}
    public static String getCanceledByIdSalesMovieSql(){return  CANCELED_BY_ID_SALES_MOVİE_SQL;}
    public static String getGetAllCanceledSalesMovieSql(){return  GET_ALL_CANCELED_SALES_MOVİE_SQL;}
    public static String getChangeAllCanceledSalesMovieSql(){return  CHANGE_ALL_CANCELED_SALES_MOVİE_SQL;}
    public static String getDeleteAllSalesMovieSql(){return  DELETE_ALL_SALES_MOVİE_SQL;}

}
