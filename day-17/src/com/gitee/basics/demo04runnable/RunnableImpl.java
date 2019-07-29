package com.gitee.basics.demo04runnable;

/**
 * @author jianghao
 * @date 2019/7/29 10:44
 * <p>
 * 创建一个Runnable接口的实现类
 */
public class RunnableImpl implements java.lang.Runnable {

    @Override
    public void run() {
        // 在实现类中重写Runnable接口的run方法,设置线程任务
        final int second = 20;
        for (int i = 0; i < second; i++) {
            System.out.println(Thread.currentThread().getName() + "->" + i);
        }
    }

}
