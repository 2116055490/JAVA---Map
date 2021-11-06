package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map接口的使用
特点： 存储键值对  键不能重复 值可以重复   无序
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map集合
        HashMap<String, String> map = new HashMap<>();
        // 添加元素
        map.put("uk","中国");
        map.put("usk","英国");
        map.put("usa","美国");
        map.put("uk","南非");
        System.out.println("元素个数"+map.size());
        System.out.println(map);
        //遍历
        //使用keySet
        for (String key:map.keySet()) {
            System.out.println(key+"-----"+map.get(key));
        }
        //使用entrySet
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }


    }
}
