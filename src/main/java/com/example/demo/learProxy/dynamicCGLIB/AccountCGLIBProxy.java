package com.example.demo.learProxy.dynamicCGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @description:CGLIB动态代理
 * @author: wangshoudao
 * @create: 2020/6/15 16:13
 */
public class AccountCGLIBProxy implements MethodInterceptor {

    private Account target;
    public AccountCGLIBProxy(Account account){
        this.target = account;
    }
    Account createProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Account.class);
        enhancer.setCallback(this);
        return (Account) enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if("transfer".equals(method.getName())){
            // 增强目标类
            System.out.println("对身份证进行验证！");
            return method.invoke(target,objects);
        }
        return method.invoke(target,objects);
    }
}
