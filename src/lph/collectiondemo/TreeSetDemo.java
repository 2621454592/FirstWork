package lph.collectiondemo;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author liph
 * @date 2020/5/14 - 17:02
 */
/*
   需求：通过学号排序学生
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        //创建TreeSet集合
        Set set= new TreeSet();
        //向TreeSet集合中添加元素
        set.add(new Person(2,"刘德华"));
        set.add(new Person(1,"张学友"));
        set.add(new Person(4,"黎明"));
        set.add(new Person(3,"郭富城"));
        System.out.println(set);
    }
}
