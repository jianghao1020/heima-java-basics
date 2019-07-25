package com.gitee.basics.demo01Map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class demo01Map {

    public static void main(String[] args) {
        show02();
    }

    /*
        public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
            返回值:v
                存储键值对的时候,key不重复,返回值V是null
                存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
    private static void show01() {
        //创建Map集合对象,多态
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1);//v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:" + v2);//v2:范冰冰1

        System.out.println(map);//{李晨=范冰冰2}

        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 冷锋=龙小云}
    }

    /*
        public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
            返回值:V
                key存在,v返回被删除的值
                key不存在,v返回null
     */
    private static void show02() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);
        System.out.println(map);//{林志玲=178, 赵丽颖=168, 杨颖=165}

        Integer v1 = map.remove("林志玲");
        System.out.println("v1:" + v1);//v1:178

        System.out.println(map);//{赵丽颖=168, 杨颖=165}

        //int v2 = map.remove("林志颖");//自动拆箱  NullPointerException
        Integer v2 = map.remove("林志颖");
        System.out.println("v2:" + v2);//v2:null

        System.out.println(map);//{赵丽颖=168, 杨颖=165}
    }

    @Test
    void show03() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        Integer v1 = map.get("杨颖");
        System.out.println("v1:" + v1);//v1:165

        Integer v2 = map.get("迪丽热巴");
        System.out.println("v2:" + v2);//v2:null
    }

    @Test
    void show04() {
        //创建Map集合对象
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 165);
        map.put("林志玲", 178);

        boolean b1 = map.containsKey("赵丽颖");
        System.out.println("b1:" + b1);//b1:true

        boolean b2 = map.containsKey("赵颖");
        System.out.println("b2:" + b2);//b2:false
    }

}
