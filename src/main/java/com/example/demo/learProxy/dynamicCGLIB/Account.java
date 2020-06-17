package com.example.demo.learProxy.dynamicCGLIB;

/**
 * 对于无接口的类，创建动态代理
 * Hibernate用它来实现持久对象的字节码动态生成，Spring用它来实现AOP编程
 * CGLIB是通过对字节码进行增强来生成代理对象的
 * 原理是生成目标类的子类，该子类就是增强过的代理类。所以要求目标类必须能够被继承，不能被final修饰
 *
 * @description:目标类 CGLIB 代理模式
 * @author: wangshoudao
 * @create: 2020/6/15 15:59
 */
public class Account {
    public void transfer() {
        System.out.println("进行转账业务！");
    }
}
