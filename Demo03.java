package com.company;

import java.util.Comparator;
import java.util.TreeSet;
/*
要求：使用TreeSet集合实现字符串按照长度进行排序
Comparator接口实现定制比较
 */
public class Demo03 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1=o1.length()-o2.length();
                int n2=o1.compareTo(o2);
                return n1==0?n2:n1;
            }
        });
        //添加元素
        treeSet.add("hello");
        treeSet.add("xiangjiao");
        treeSet.add("lisi");
        treeSet.add("wang");
        System.out.println(treeSet);
    }
}
