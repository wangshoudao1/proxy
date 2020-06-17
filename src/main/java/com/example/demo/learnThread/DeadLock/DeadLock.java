package com.example.demo.learnThread.DeadLock;

import lombok.extern.slf4j.Slf4j;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 13:22
 */
@Slf4j
public class DeadLock implements Runnable{
    private int i=0;

    @Override
    public void run() {
        while(true) {
            if(i%2==0){
                synchronized(LockA.lockA) {
                    System.out.println("if...lockA");
                    synchronized(LockB.lockB) {
                        System.out.println("if...lockB");
                    }
                }
            }else {
                synchronized(LockB.lockB) {
                    System.out.println("else...lockB");
                    synchronized(LockA.lockA) {
                        System.out.println("else...lockA");
                    }
                }
            }
            i++;
        }
    }
}
