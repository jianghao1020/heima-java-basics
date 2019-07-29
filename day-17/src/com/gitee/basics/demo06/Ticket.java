package com.gitee.basics.demo06;

/**
 * 模拟卖票案例
 * 创建3个线程,同时开启,对共享的票进行出售
 *
 * @author jianghao
 * @date 2019/7/29 11:34
 */
public class Ticket {

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        Runnable runnable = new RunnableImpl();
        // 创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread thread01 = new Thread(runnable);
        Thread thread02 = new Thread(runnable);
        Thread thread03 = new Thread(runnable);
        Thread thread04 = new Thread(runnable);
        Thread thread05 = new Thread(runnable);
        // 调用start方法开启多线程
        thread01.start();
        thread02.start();
        thread03.start();
        thread04.start();
        thread05.start();
    }

}
