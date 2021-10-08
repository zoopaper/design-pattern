package com.pattern.callback;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client implements Callback {

    private ExecutorService executorService = Executors.newCachedThreadPool();

    private Server server;

    Client(Server server) {
        this.server = server;
    }

    public void sendMsg(final String msg) {
        System.out.println("客户端发送的消息是：" + msg);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                server.receive(Client.this, msg);
            }
        });

        System.out.println("客户端异步发送成功!");
        executorService.shutdown();
    }


    @Override
    public void process(String status) {
        System.out.println("客户端获取服务端的回调状态为:" + status);
    }
}
