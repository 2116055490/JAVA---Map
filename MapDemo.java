package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("CCTV","中央电视台");
        map.put("HNTV","河南电视台");
        map.put("BJTV","北京电视台");
        map.put("TVB","翡翠台");
        //显示CCTV对应的中文名称
        Object cc = map.get("CCTV");
        System.out.println(cc);
        //显示集合中的元素个数
        System.out.println("元素个数"+map.size());
        //判断是否包含键CCTV
        System.out.println("是否包含CCTV键"+map.containsKey("CCTV"));
        //分别显示键集 值集 和键值对
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);


        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //System.out.println("键："+map.keySet()+",值："+map.values());
            break;
        }
        /*//清空map中的数据
        map.clear();
        while(map.isEmpty()){
            System.out.println("已清空");
            break;
        }*/

    }
}
