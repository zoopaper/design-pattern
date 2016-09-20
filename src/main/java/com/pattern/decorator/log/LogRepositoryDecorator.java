package com.pattern.decorator.log;

/**
 * User: shijingui
 * Date: 2016/9/20
 */
public class LogRepositoryDecorator<T> implements GenericRepository<T, Long> {

    private GenericRepository genericRepository;

    public LogRepositoryDecorator(GenericRepository genericRepository) {
        this.genericRepository = genericRepository;
    }

    @Override
    public void save(T entity) {
        saveLog(entity);
        //执行数据库保存操作
    }

    @Override
    public void update(T entity) {
        saveLog(entity);
        //执行数据库更新操作
    }

    @Override
    public T findById(Long id) {

        //执行数据库保存操作
        return null;
    }

    @Override
    public void delete(T entity) {
        saveLog(entity);
        //执行数据库删除操作
    }

    private void saveLog(T entity) {
        //保存日志到数据库
    }
}
