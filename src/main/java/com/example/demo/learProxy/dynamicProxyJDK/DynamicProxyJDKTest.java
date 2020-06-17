package com.example.demo.learProxy.dynamicProxyJDK;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 14:53
 */
public class DynamicProxyJDKTest {
    public static void main(String[] args) {
        // 1.创建目标对象
        IAccountService target = new AccountServiceImpl();
        // 2.使用目标对象初始化代理对象
        IAccountService service = (IAccountService)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),// 获取目标类的类加载器
                target.getClass().getInterfaces(),// 获取目标类实现的所有接口
                new MyExtension(target)
        );
        service.transfer();
    }
}
