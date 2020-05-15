package lph.mapdemo;

import lph.collectiondemo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author liph
 * @date 2020/5/15 - 0:19
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建一个HashMap集合
        Map map = new HashMap();
        //向集合中添加元素
        map.put("name","张三");
        map.put(new Integer(3),4);
        map.put("stu1",new Person());
        map.put("students",new ArrayList());
        System.out.println(map);
        //删除key为students的值
        map.remove("students");
        //修改key为name的值
        map.put("name","李四");
       //根据map的key获取对应的值
        Object o = map.get("name");
        System.out.println(o);
        //获取到map中所有的key值装入到一个set集合中
        Set set = map.keySet();
        //map的遍历
        for(Object o1 : set){
            Object value = map.get(o1);//通过循环遍历key的值获取对应的value的值
            System.out.print(value+" ");
        }
        System.out.println();
       //输出map的大小
        System.out.println( map.size());

    }
}
