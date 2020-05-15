package lph.collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author liph
 * @date 2020/5/14 - 15:17
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //创建LinkedList，指定数据类型为String
        LinkedList<String> linkedList=new LinkedList<String>();
        //在开头添加元素
        linkedList.addFirst("刘德华");
        //在结尾添加元素
        linkedList.add("张学友");
        //在指定位置添加元素
        linkedList.add(2,"郭富城");
        //在结尾添加元素
        linkedList.addLast("黎明");
        //输出集合
        System.out.println("集合为："+linkedList);
        //获取第一个元素
        System.out.println(linkedList.getFirst());
        //获取最后一个元素
        System.out.println(linkedList.getLast());
        //返回集合中元素的个数
        System.out.println(linkedList.size());
        //修改指定位置的元素
        linkedList.set(2,"张学友2");
        //获取指定位置的元素
        linkedList.get(1);
        //删除指定位置元素
        linkedList.remove(3);
        //通过迭代器来遍历集合
        System.out.print("通过迭代器遍历：");
        Iterator iterator=linkedList.iterator();
        while (iterator.hasNext()){
            Object object1=iterator.next();
            System.out.print(object1+" ");
        }
        System.out.println();
        //通过索引遍历集合
        System.out.print("通过索引值遍历：");
        for (int i = 0; i <linkedList.size() ; i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        System.out.println();
        //通过增强for循环遍历
        System.out.print("增强for循环遍历：");
        for (Object object2 : linkedList){
            System.out.print(object2+" ");
        }
    }
}
