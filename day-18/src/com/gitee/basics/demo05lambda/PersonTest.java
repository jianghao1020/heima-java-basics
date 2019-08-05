package com.gitee.basics.demo05lambda;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Lambda表达式有参数有返回值的练习
 * 需求:
 * 使用数组存储多个Person对象
 * 对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
 *
 * @author jianghao
 * @date 2019/8/5 11:13
 */
class PersonTest {

    /**
     * 遍历数组
     */
    @Test
    void test01() {
        // 使用数组存储多个Person对象
        Person[] people = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 19)
        };
        Arrays.sort(people, (o1, o2) -> o1.getAge() - o2.getAge());
        for (Person person : people) {
            System.out.println(person);
        }
    }

    @Test
    void test02() {
        // 使用数组存储多个Person对象
        Person[] people = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("古力娜扎", 32),
                new Person("马尔扎哈", 11)
        };
        Arrays.sort(people, Comparator.comparingInt(Person::getAge));
        for (Person person : people) {
            System.out.println(person);
        }
    }

    /**
     * 对数组中的Person对象使用Arrays的sort方法通过年龄进行升序(前边-后边)排序
     */
    @Test
    void test03() {
        // 使用数组存储多个Person对象
        Person[] people = {
                new Person("柳岩", 38),
                new Person("迪丽热巴", 18),
                new Person("刘亦菲", 21),
                new Person("古力娜扎", 32),
                new Person("马尔扎哈", 11)
        };
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (Person person : people) {
            System.out.println(person);
        }
    }

}
