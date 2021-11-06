package com.company;

import java.util.Comparator;
import java.util.TreeSet;
/*
TreeSet集合的使用
Comparator:实现定制比较（比较器）
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建集合，并指定比较规则
        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1=o1.getAge()- o2.getAge();
                int n2=o1.getName().compareTo(o2.getName());
                return n1==0?n2:n1;
            }
        });
        Person p1 = new Person("刘德华",24);
        Person p2 = new Person("小沈阳",28);
        Person p3 = new Person("周星驰",34);
        Person p4 = new Person("小沈阳",34);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        System.out.println("元素个数"+people.size());
    }
}
