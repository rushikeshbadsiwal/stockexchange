package com.testproject;

public class SqlQueries {
    public static final String DELETE_USER_QUERY="delete from User where userUUID=:userUUID";

    public static final String ADD_USER_QUERY="insert into User values (userUUID, name)";

    public static final String GET_USER_QUERY="select * from User where userUUID=:userUUID";

    public static final String GET_ALL_USERS_QUERY="select * from User";

    public static final String UPDATE_USER_QUERY="update User set name=:name where userUUID=:userUUID";

    public static final String DELETE_STOCK_QUERY="delete from Stock where symbol=:symbol";

    public static final String ADD_STOCK_QUERY="insert into Stock values (symbol, count, price)";

    public static final String GET_STOCK_QUERY="select * from Stock where symbol=:symbol";

    public static final String GET_ALL_STOCK_QUERY="select * from Stock";

    public static final String UPDATE_STOCK_COUNT_QUERY="update Stock set count=:count where symbol=:symbol";

    public static final String UPDATE_STOCK_PRICE_QUERY="update Stock set price=:price where symbol=:symbol";
}
