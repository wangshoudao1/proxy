package com.example.demo.learProxy.dynamicProxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理：JDK的动态代理和 CGLIB动态代理
 * 类似于企业与代理律师
 *
 * 代理对象在程序运行时，根据JVM发射机制动态生成
 *
 * @description:JDK的proxy模式
 * @author: wangshoudao
 * @create: 2020/6/15 14:38
 */
public class MyExtension implements InvocationHandler {
    private Object obj;
    public MyExtension(Object target){
        this.obj = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 增强目标类
        System.out.println("对身份证进行验证！");
        return method.invoke( obj, args);
    }
}
