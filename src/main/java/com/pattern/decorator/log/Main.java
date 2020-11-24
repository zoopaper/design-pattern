package com.pattern.decorator.log;

import com.pattern.decorator.log.model.User;

/**
 * User: krisjin
 * Date: 2016/9/20
 */
public class Main {
    public static void main(String[] args) {
        GenericRepository genericRepository = new GenericRepositoryHibernate<User>();
        genericRepository = new LogRepositoryDecorator(genericRepository);
    }

}
