package com.pattern.singleton;

import java.io.Serializable;

/**
 * User: krisjin
 * Date: 2016/9/20
 */
public class SerializeSingleton implements Serializable {

    private static final long serialVersionUID = -7960628108141408430L;
    private static SerializeSingleton instance = new SerializeSingleton();

    private SerializeSingleton() {
    }

    public static SerializeSingleton getInstance() {
        return instance;
    }

    /**
     * 此方法在反序列化前被执行，阻止生成新的实例，总是返回当前对象
     *
     * @return
     */
    public Object readResolve() {
        return instance;
    }
}
