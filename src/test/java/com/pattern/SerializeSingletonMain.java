package com.pattern;

import com.pattern.singleton.SerializeSingleton;
import org.junit.Test;

import java.io.*;

/**
 * User: krisjin
 * Date: 2016/9/20
 */
public class SerializeSingletonMain {

    @Test
    public void test() throws IOException, ClassNotFoundException {
        File file = new File("Singleton.out");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        SerializeSingleton serializeSingleton = SerializeSingleton.getInstance();
        oos.writeObject(serializeSingleton);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(file));
        Object obj1 = ois.readObject();
        Object obj2 = ois2.readObject();
        ois.close();
        System.out.println(obj1 == obj2);
    }
}
