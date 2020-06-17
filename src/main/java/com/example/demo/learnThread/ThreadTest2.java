package com.example.demo.learnThread;

/**
 * @description:
 * @author: wangshoudao
 * @create: 2020/6/15 11:35
 */
public class ThreadTest2 implements Runnable {
    private static String winner;

    @Override
    public void run() {
        //赛道
        for (int step = 1; step <= 101; step++) {
            if (Thread.currentThread().getName().equals("兔子") && step  == 50) {
                try {
                    Thread.sleep(100);          //兔子休眠
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag = gameOver(step);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + step + "步");
        }
    }

    //判断比赛是否结束
    private boolean gameOver(int step) {
        if (winner != null) { //如果存在胜利者
            return true;
        }
        if (step >= 100) {  //如果跑到了比赛结束
            winner = Thread.currentThread().getName();
            System.out.println("比赛结束");
            System.out.println("胜利者----->" + winner);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ThreadTest2 race = new ThreadTest2();           //创建一个跑道

        new Thread(race, "兔子").start();         //两个线程
        new Thread(race, "乌龟").start();
    }


}
