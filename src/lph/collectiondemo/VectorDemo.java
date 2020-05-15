package lph.collectiondemo;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author liph
 * @date 2020/5/14 - 15:32
 */
public class VectorDemo {
    public static void main(String[] args) {
        //创建vector
        Vector vector=new Vector();
        //添加元素
        vector.add("1");
        vector.add("2");
        //在指定位置添加元素
        vector.add(2,"3");
        vector.add("4");
        vector.add("5");
        System.out.println(vector);
        //获取第一个元素
        System.out.println(vector.firstElement());
        //获取最后一个元素
        System.out.println(vector.lastElement());
        //获取vector的大小
        System.out.println(vector.size());
        //修改指定位置的元素
        vector.set(1,"11");
        //删除指定位置的元素
        vector.remove(4);
        //通过迭代器来遍历集合
        System.out.print("通过迭代器遍历：");
        Iterator iterator=vector.iterator();
        while (iterator.hasNext()){
            Object object1=iterator.next();
            System.out.print(object1+" ");
        }
        System.out.println();
        //通过索引遍历集合
        System.out.print("通过索引值遍历：");
        for (int i = 0; i <vector.size() ; i++) {
            System.out.print(vector.get(i)+" ");
        }
        System.out.println();
        //通过增强for循环遍历
        System.out.print("增强for循环遍历：");
        for (Object object2 : vector){
            System.out.print(object2+" ");
        }

    }
}
