package com.example.demo.learnThread.ThreadTypes;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/17 13:14
 */
public class ThreadTest3 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "renci" + i);
            Thread.sleep(10);
        }
        return Thread.currentThread().getName();
    }

    public static void main(String[] args) throws Exception{
        // 3.创建线程类的实例对象
        ThreadTest3 myThread3 = new ThreadTest3();
        // 4.创建FutureTask的实例对象来包装线程类实例对象
        FutureTask futureTask = new FutureTask(myThread3);
        FutureTask futureTask2 = new FutureTask(myThread3);
        FutureTask futureTask3 = new FutureTask(myThread3);
        // 5.创建Thread的实例对象来包装Future类的实例对象
        Thread t = new Thread(futureTask);
        Thread t2 = new Thread(futureTask2);
        Thread t3 = new Thread(futureTask3);
        t.setDaemon(true);
        t.start();
        t.join(); // join()方法：调用线程等待该线程完成后才能执行。，没有join方法时，主线程和次线程会并发执行。
        t3.start();
        t3.join();
        // t.join()方法只会使主线程进入等待池并等待t线程执行完毕后才会被唤醒。并不影响同一时刻处在运行状态的其他线程。
        t2.start();
        t2.join();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "   主线程  " + i);
            Thread.sleep(1000);
        }
        // 打印出call()方法的返回值
        System.out.println(futureTask.get()+"调用的方法");
    }
}
