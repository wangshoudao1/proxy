package com.example.demo.learProxy.staticProxy;

/**
 * 代理模式：为某个对象提供一种代理以控制该对象的访问
 *使用代理对象，是在不改变目标类的基础上，增强主业务逻辑
 *
 *特点:
 * 1.代理类和目标类实现同一个业务接口
 * 2.客户类对目标类的调用都是通过对代理类的调用
 * 3.代理类不仅调用了目标类，也增强了主业务逻辑
 *
 * * 根据代理关系建立的时间分为：动态代理，静态代理
 *
 * @description:静态代理
 * 静态代理类似于企业与法律顾问的关系：在“官司”发生前就已经建立的一种关系。
 * 代理类在程序运行前已经定义好 与目标类的关系
 * @author: wangshoudao
 * @create: 2020/6/15 13:59
 */
public class StaticProxy implements IAccountService {
    public StaticProxy () {}
    // 声明目标接口
    public IAccountService target;
    public StaticProxy(IAccountService target){
        this.target = target;
    }

    @Override
    public void transfer() {
        // 增强目标类
        System.out.println("对身份证进行验证！");
        target.transfer();
    }
}
