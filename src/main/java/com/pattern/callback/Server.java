package com.pattern.callback;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/10/28
 * Time: 17:48
 */
public class Server {

    public void receive(Callback callback, String msg) {

        System.out.println("服务端接收到客户端发送的消息是：" + msg);

        //模拟服务端的数据处理
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("服务端数据处理成功，返回成功状态200");

        //调用回调接口
        callback.process("200");
    }

}
