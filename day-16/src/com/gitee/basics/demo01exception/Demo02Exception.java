package com.gitee.basics.demo01exception;

/**
 * 异常的产生过程解析(分析异常的怎么产生的,如何处理异常)
 *
 * @author jianghao
 */
public class Demo02Exception {

    public static void main(String[] args) {
        //创建int类型的数组,并赋值
        int[] arr = {1, 2, 3, 4};
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    /**
     * 定义一个方法,获取数组指定索引处的元素
     * 参数:
     * int[] arr
     * int index
     */
    private static int getElement(int[] arr, int index) {
        int ele = arr[index];
        return ele;
    }

}
