package com.company;

import java.util.Iterator;
import java.util.TreeSet;
/*
TreeSet保存数据
存储结构：红黑树
要求：元素必须实现Comparable接口，compareTo()方法返回值为0，认为是重复元素
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Person> person = new TreeSet<>();
        //添加元素
        Person p1 = new Person("刘德华",24);
        Person p2 = new Person("小沈阳",28);
        Person p3 = new Person("周星驰",34);
        Person p4 = new Person("小沈阳",34);
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        System.out.println("元素个数"+person.size());
        System.out.println(person);
        //删除元素
        person.remove(p1);
        System.out.println("元素个数"+person.size());
        //增强for
        for (Person st :
                person) {
            System.out.println(st);
        }
        //迭代器
        Iterator<Person> iterator = person.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //判断
        System.out.println(person.contains(new Person("周星驰",34)));
        System.out.println(person.isEmpty());
    }
}
