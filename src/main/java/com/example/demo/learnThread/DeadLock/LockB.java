package com.example.demo.learnThread.DeadLock;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 13:23
 */
public class LockB {
    private LockB() {};
    public static final LockB lockB = new LockB();
}
