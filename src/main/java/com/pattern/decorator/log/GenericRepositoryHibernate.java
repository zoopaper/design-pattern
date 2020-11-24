package com.pattern.decorator.log;

/**
 * User: krisjin
 * Date: 2016/9/20
 */
public class GenericRepositoryHibernate<T> implements GenericRepository<T, Long> {
    @Override
    public void save(T entity) {

    }

    @Override
    public void update(T entity) {

    }

    @Override
    public T findById(Long aLong) {
        return null;
    }

    @Override
    public void delete(T entity) {

    }
}
