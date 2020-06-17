package com.example.demo.learProxy.staticProxy;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 14:06
 */
public class AccountServiceImpl implements IAccountService {
    @Override
    public void transfer() {
        System.out.println("主要完成转账业务！");
    }
}
