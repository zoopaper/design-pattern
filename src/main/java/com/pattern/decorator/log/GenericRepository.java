package com.pattern.decorator.log;

import java.io.Serializable;

/**
 * User: shijingui
 * Date: 2016/9/20
 */
public interface GenericRepository<T, ID extends Serializable> {

    public void save(T entity);

    public void update(T entity);

    public T findById(ID id);

    public void delete(T entity);
}
