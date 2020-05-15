package lph.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liph
 * @date 2020/5/14 - 15:04
 */
public class ArrayListDemo01 {
    public static void main(String[] args) {
        //创建ArrayList
        List list=new ArrayList();
        //在指定位置添加元素
        list.add(0,"徐骁");
        list .add("徐凤年");
        list.add(2,"姜妮");
        list.add("裴南苇");
        list.add("南宫仆射");
        System.out.println(list);
        //删除指定位置的元素
        list.remove(3);
        //修改元素
        list.set(0,"徐骁1");
        System.out.println(list);
        //查询元素
        Object object=list.get(1);
        System.out.println(object);
        //获取集合大小
        System.out.println(list.size());
        //通过迭代器来遍历集合
        System.out.print("通过迭代器遍历：");
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Object object1=iterator.next();
            System.out.print(object1+" ");
        }
        System.out.println();
        //通过索引遍历集合
        System.out.print("通过索引值遍历：");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //通过增强for循环遍历
        System.out.print("增强for循环遍历：");
        for (Object object2 : list){
            System.out.print(object2+" ");
        }
        System.out.println();
        //清空ArrayList
        list.clear();
        //判断是否清空ArrayList
        System.out.println(list.isEmpty());
    }

}
