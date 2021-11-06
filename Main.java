package com.company;

import java.util.Iterator;
import java.util.TreeSet;

/*
TreeSet的使用
    存储结构：红黑树
 */
public class Main {

    public static void main(String[] args) {
        //创建集合
        TreeSet<String> treeSet= new TreeSet<>();
        //添加元素
        treeSet.add("xyx");
        treeSet.add("小明");
        treeSet.add("add");
        //treeSet.add("add");
        System.out.println("元素个数："+treeSet.size());
        System.out.println(treeSet);
        // 删除元素
        treeSet.remove("小明");
        System.out.println("元素个数："+treeSet.size());
        // 遍历
        for (String st :
                treeSet) {
            System.out.println(st);
        }
        //迭代器
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 判读
        System.out.println(treeSet.contains("add"));
        System.out.println(treeSet.isEmpty());

    }
}
