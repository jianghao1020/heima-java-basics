package com.gitee.basics.demo06lambda;

import org.junit.jupiter.api.Test;

/**
 * Lambda表达式有参数有返回值的练习
 * 需求:
 * 给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 * 使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 *
 * @author jianghao
 * @date 2019/8/5 11:35
 */
class CalculatorTest {

    /**
     * 调用invokeCalc方法,方法的参数是一个接口,可以使用匿名内部类
     */
    @Test
    void test01() {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
    }

    /**
     * 使用Lambda表达式简化匿名内部类的书写
     */
    @Test
    void test02() {
        invokeCalc(120, 300, Integer::sum);
    }

    /**
     * 定义一个方法
     * 参数传递两个int类型的整数
     * 参数传递Calculator接口
     * 方法内部调用Calculator中的方法calc计算两个整数的和
     *
     * @param a          a
     * @param b          b
     * @param calculator calculator
     */
    private static void invokeCalc(int a, int b, Calculator calculator) {
        int sum = calculator.calc(a, b);
        System.out.println(sum);
    }

}
