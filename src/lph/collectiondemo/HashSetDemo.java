package lph.collectiondemo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author liph
 * @date 2020/5/14 - 16:10
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //创建一个HashSet集合
        Set set= new HashSet();
        //set添加元素至HashSet
        set.add("张三");
        set.add(3);
        set.add("李四");
        set.add("王五");
        set.add("王五");
        //输出HashSet集合
        System.out.println(set);
        //删除元素
        set.remove("王五");
        //修改元素--把李四改成李四2,先删除在添加
        set.remove("李四");
        set.add("李四2");
        //输出HashSet集合
        System.out.println(set);
        //输出HashSet集合
        System.out.println(set.size());
    }
}
