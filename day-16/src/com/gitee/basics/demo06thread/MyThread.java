package com.gitee.basics.demo06thread;

/**
 * 1.创建一个Thread类的子类
 *
 * @author jianghao
 */
public class MyThread extends Thread {

    /**
     * 2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
     */
    @Override
    public void run() {
        final int length = 20;
        for (int i = 0; i < length; i++) {
            System.out.println("run:" + i);
        }
    }
}
