package com.gitee.basics.demo01exception;

import java.util.Objects;

/**
 * Objects类中的静态方法
 * public static <T> T requireNonNull(T obj):查看指定引用对象不是null。
 * 源码:
 * public static <T> T requireNonNull(T obj) {
 * if (obj == null)
 * throw new NullPointerException();
 * return obj;
 * }
 *
 * @author jianghao
 */
public class Demo04Objects {

    public static void main(String[] args) {
        method(true);
    }

    public static void method(Object obj) {
        //对传递过来的参数进行合法性判断,判断是否为null
        /*if(obj == null){
            throw new NullPointerException("传递的对象的值是null");
        }*/

        // Objects.requireNonNull(obj);
        Objects.requireNonNull(obj, "传递的对象的值是null");
    }

}
