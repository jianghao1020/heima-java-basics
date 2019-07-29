package com.gitee.basics.demo03sleep;

/**
 * @author jianghao
 * @date 2019/7/29 10:35
 * <p>
 * public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
 * 毫秒数结束之后,线程继续执行
 */
public class Sleep {

    public static void main(String[] args) {
        final int second = 60;
        for (int i = 1; i <= second; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
