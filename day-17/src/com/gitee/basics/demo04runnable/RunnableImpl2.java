package com.gitee.basics.demo04runnable;

/**
 * @author jianghao
 * @date 2019/7/29 11:04
 * <p>
 * 创建一个Runnable接口的实现类
 */
public class RunnableImpl2 implements java.lang.Runnable {
    @Override
    public void run() {
        final var second = 20;
        for (int i = 0; i < second; i++) {
            System.out.println("HelloWorld" + i);
        }
    }
}
