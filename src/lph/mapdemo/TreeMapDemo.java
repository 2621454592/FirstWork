package lph.mapdemo;

import java.util.TreeMap;

/**
 * @author liph
 * @date 2020/5/15 - 0:35
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //创建TreeMap集合
        TreeMap<Person,String> t= new TreeMap<Person,String>();
        //向集合中添加元素
        t.put(new Person(1003,"pengpeng"), "beijing");
        t.put(new Person(1002,"zichen"), "beijing");
        t.put(new Person(1001,"songkun"), "beijing");
        t.put(new Person(1004,"chenzhang"), "beijing");
        //输出集合
        System.out.println(t);

    }
}
