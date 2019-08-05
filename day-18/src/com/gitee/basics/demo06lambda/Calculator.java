package com.gitee.basics.demo06lambda;

/**
 * 给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 *
 * @author jianghao
 */
public interface Calculator {

    /**
     * 定义一个计算两个int整数和的方法并返回结果
     *
     * @param a a
     * @param b b
     * @return int
     */
    int calc(int a, int b);

}
