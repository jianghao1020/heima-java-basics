package com.gitee.basics.demo02setname;

/**
 * @author jianghao
 * @date 2019/7/29 10:27
 */
public class SetThreadName {

    public static void main(String[] args) {
        // 开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        // 开启多线程
        new MyThread("旺财").start();
    }
}
