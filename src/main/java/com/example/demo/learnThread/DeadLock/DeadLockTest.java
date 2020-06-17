package com.example.demo.learnThread.DeadLock;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 13:23
 */
@Slf4j
public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();

        Thread t1 = new Thread(deadLock);
        Thread t2 = new Thread(deadLock);
        t1.start();
        t2.start();
        log.error("最后一定要执行！");
    }
}
