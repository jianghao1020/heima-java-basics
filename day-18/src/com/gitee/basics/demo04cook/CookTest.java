package com.gitee.basics.demo04cook;

import org.junit.jupiter.api.Test;

/**
 * 需求:
 * 给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
 * 使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
 *
 * @author jianghao
 * @date 2019/8/5 11:03
 */
class CookTest {

    /**
     * 优化省略Lambda
     */
    @Test
    void test01() {
        invokeCook(() -> System.out.println("吃饭了"));
    }

    /**
     * 使用Lambda表达式,简化匿名内部类的书写
     */
    @Test
    void test02() {
        invokeCook(() -> {
            System.out.println("又吃饭了");
        });
    }

    /**
     * 调用invokeCook方法,参数是Cook接口,传递Cook接口的匿名内部类对象
     */
    @Test
    void test03() {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("你还吃？？？？");
            }
        });
    }

    /**
     * 定义一个方法,参数传递Cook接口,方法内部调用Cook接口中的方法makeFood
     *
     * @param cook cook
     */
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
