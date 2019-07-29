package com.gitee.basics.demo07synchronized;

/**
 * 模拟卖票案例
 * 创建3个线程,同时开启,对共享的票进行出售
 *
 * @author jianghao
 * @date 2019/7/29 11:51
 */
public class Ticket {

    public static void main(String[] args) {
        // 创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象,构造方法中传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);
        // 调用start方法开启多线程
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
