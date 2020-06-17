package com.example.demo.learProxy.staticProxy;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 14:27
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        // 1.创建目标对象
        IAccountService target = new AccountServiceImpl();
        // 2.使用目标对象初始化代理对象
        IAccountService service = new StaticProxy(target);
        service.transfer();
    }
}
