package com.example.demo.learProxy.dynamicCGLIB;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 16:22
 */
public class AccountCGLIBProxyTest {
    public static void main(String[] args) {
        Account account = new Account();
        Account accountTarget = new AccountCGLIBProxy(account).createProxy();
        accountTarget.transfer();
    }
}
