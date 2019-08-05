package com.gitee.basics.demo01waitandnotify;

/**
 * @author jianghao
 */
public class ChiHuo extends Thread {

    // 1.需要在成员位置创建一个包子变量
    private BaoZi baoZi;

    // 2.使用带参数构造方法,为这个包子变量赋值
    public ChiHuo(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    // 设置线程任务(run):吃包子
    @Override
    public void run() {
        while (true) {
            synchronized (baoZi) {
                if (baoZi.flag == false) {
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 被唤醒之后执行的代码,吃包子
                System.out.println("吃货正在吃:" + baoZi.pi + baoZi.xian + "的包子");
                // 吃货吃完包子
                // 修改包子的状态为false没有
                baoZi.flag = false;
                // 吃货唤醒包子铺线程,生产包子
                baoZi.notify();
                System.out.println("吃货已经把:" + baoZi.pi + baoZi.xian + "的包子吃完了,包子铺开始生产包子");
                System.out.println("----------------------------------------------------");
            }
        }
    }

}
