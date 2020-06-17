package com.example.demo.learnThread;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 12:56
 */
public class ThreadTest11 implements Runnable{
    //票
    private int ticketNums = 10;
    @Override
    public void run() {
        test();
    }

    public void test() {
        while (true) {
            if (ticketNums < 0) {
                break;
            }
            try {
                // 模拟网络延时，睡眠
                Thread.sleep(10); //该线程在未来的多少毫秒内不参与CPU竞争
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->抢到了第" + ticketNums-- + "张票");
        }
    }

    public static void main(String[] args) {
        ThreadTest1 t = new ThreadTest1();
        //第二个参数，创建线程名字
        new Thread(t, "小明").start();
        new Thread(t, "老师").start();
        new Thread(t, "黄牛党").start();
    }
}
