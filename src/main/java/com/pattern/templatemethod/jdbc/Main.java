package com.pattern.templatemethod.jdbc;

import java.sql.ResultSet;

/**
 * User: shijingui
 * Date: 2016/9/19
 */
public class Main {
    public static void main(String[] args) {
        SimpleJdbcQueryTemplate simpleJdbcQueryTemplate = new SimpleJdbcQueryTemplate();

        simpleJdbcQueryTemplate.query("select * from db", new ResultSetHandle<Boolean>() {

            @Override
            public Boolean handle(ResultSet resultSet) {

                return Boolean.TRUE;
            }
        });
    }
}
