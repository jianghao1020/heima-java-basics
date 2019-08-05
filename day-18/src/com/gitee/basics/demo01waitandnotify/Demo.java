package com.gitee.basics.demo01waitandnotify;

/**
 * 测试类:
 * 包含main方法,程序执行的入口,启动程序
 * 创建包子对象;
 * 创建包子铺线程,开启,生产包子;
 * 创建吃货线程,开启,吃包子;
 *
 * @author jianghao
 * @date 2019/8/5 10:01
 */
public class Demo {

    public static void main(String[] args) {
        // 创建包子对象;
        BaoZi baoZi = new BaoZi();
        // 创建包子铺线程,开启,生产包子;
        new BaoZiPu(baoZi).start();
        // 创建吃货线程,开启,吃包子;
        new ChiHuo(baoZi).start();
    }

}
