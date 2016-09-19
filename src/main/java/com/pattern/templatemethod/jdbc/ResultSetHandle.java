package com.pattern.templatemethod.jdbc;

import java.sql.ResultSet;

/**
 * User: shijingui
 * Date: 2016/9/19
 */
public interface ResultSetHandle<T> {
    public T handle(ResultSet resultSet);
}
