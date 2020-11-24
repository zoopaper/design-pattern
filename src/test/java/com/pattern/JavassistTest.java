package com.pattern;

import javassist.*;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * User: krisjin
 * Date: 2016/9/19
 */
public class JavassistTest {
    @Test
    public void testNewInstance() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        CtClass ctClass = pool.get("com.medusar.compile.Hello");
        Class clzz = ctClass.toClass();
        Object obj = clzz.newInstance();

    }

    @Test
    public void testCreateClass() throws CannotCompileException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ClassPool pool = ClassPool.getDefault();
        // 创建类
        CtClass clazz = pool.makeClass("org.dp.TestClass");
        // 为创建的类添加方法
        clazz.addMethod(CtNewMethod.make("public void make(){System.out.println(\"hello\"+ (8*8));}", clazz));
        Class clazz1 = clazz.toClass();
        Method method = clazz1.getMethod("make");
        method.invoke(clazz1.newInstance());
        System.out.println(clazz.getName());
        // makeClass 用于创建类
        // makeInterface用于创建接口
        // 接口中的方法可以通过CtNewMethod的abstractMethod方法创建
    }

    @Test
    public void testAddFiled() throws CannotCompileException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        ClassPool classPool = ClassPool.getDefault();
        CtClass clazz = classPool.makeClass("org.dp.TestClass");
        CtClass person = classPool.makeInterface("org.dp.Person");
        clazz.addField(CtField.make("public String name =\"Hello javassist\";", clazz));
        clazz.addMethod(CtNewMethod.make("public void print(){System.out.println(name);}", clazz));

        Class clazz1 = clazz.toClass();
        Method method = clazz1.getMethod("print");
        method.invoke(clazz1.newInstance());
    }
}
