package com.gitee.basics.demo02threadpool;

/**
 * 创建一个类,实现Runnable接口,重写run方法,设置线程任务
 *
 * @author jianghao
 * @date 2019/8/5 10:24
 */
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行");
    }

}
