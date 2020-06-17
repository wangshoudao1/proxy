package com.example.demo.learnThread.DeadLock;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 13:22
 */
public class LockA {
    private LockA(){}
    public static final LockA lockA = new LockA();
}
