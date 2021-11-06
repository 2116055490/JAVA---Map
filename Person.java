package com.company;

public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    // 先按姓名比 再按年龄比
    public int compareTo(Person o) {
        int n1=this.getName().compareTo(o.getName());
        int n2=this.age-o.getAge();
        return n2==0?n1:n2;
    }
}
