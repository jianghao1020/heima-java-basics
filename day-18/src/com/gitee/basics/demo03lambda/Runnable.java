package com.gitee.basics.demo03lambda;

/**
 * 使用实现Runnable接口的方式实现多线程程序
 *
 * @author jianghao
 * @date 2019/8/5 10:39
 */
public class Runnable {

    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();
        Thread thread =new Thread(run);
        thread.start();
    }

}
