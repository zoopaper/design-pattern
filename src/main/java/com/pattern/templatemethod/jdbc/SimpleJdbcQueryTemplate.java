package com.pattern.templatemethod.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * User: krisjin
 * Date: 2016/9/19
 */
public class SimpleJdbcQueryTemplate {

    public <T> T query(String queryString, ResultSetHandle<T> resultSetHandle) {


        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(queryString);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSetHandle.handle(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //close
        }
        return null;
    }
}
