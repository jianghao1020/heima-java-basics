package com.gitee.basics.demo03lambda;

/**
 * 创建Runnable接口的实现类,重写run方法,设置线程任务
 *
 * @author jianghao
 * @date 2019/8/5 10:37
 */
public class RunnableImpl extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" 新线程创建了");
    }
}
