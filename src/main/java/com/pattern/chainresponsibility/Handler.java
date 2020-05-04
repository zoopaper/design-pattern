package com.pattern.chainresponsibility;

/**
 * 这是一个抽象类，提供给所有实际处理器进行继承。
 * 它拥有一个handleRequest,用来接收需要处理的请求。
 * User:krisjin
 * Date:2020-05-04
 */
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    public abstract void handelRequest(RequestType requestType);
}
