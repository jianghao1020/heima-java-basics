package com.gitee.basics.deom03;

import java.util.Random;

/**
 * Random类用来生成随机数字。使用起来也是三个步骤：
 * <p>
 * 1. 导包
 * import java.util.Random;
 * <p>
 * 2. 创建
 * Random r = new Random(); // 小括号当中留空即可
 * <p>
 * 3. 使用
 * 获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
 * 获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
 * 实际上代表的含义是：[0,3)，也就是0~2
 */
public class Demo01Random {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt();
            System.out.println("随机数" + i + "是" + number);
        }
    }
}
