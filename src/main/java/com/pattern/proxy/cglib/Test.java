package com.pattern.proxy.cglib;

/**
 * @author krisjin
 * @date 2015-1-26
 */
public class Test {

    public static void main(String[] args) {

        DaoFacadeProxy proxy = new DaoFacadeProxy();

        DaoFacadeImpl dao = (DaoFacadeImpl) proxy.getInstance(new DaoFacadeImpl());

        dao.execute();
    }

}
