package lph.collectiondemo;

import java.util.ArrayDeque;

/**
 * @author liph
 * @date 2020/5/14 - 22:10
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque();
        //将指定元素添加到双端队列的头部
        arrayDeque.addFirst(1);
        arrayDeque.addFirst(2);
        //将指定元素添加到双端队列的尾部
        arrayDeque.addLast(3);
        arrayDeque.addLast(4);
        arrayDeque.addLast(5);
        //输出双端队列
        System.out.println(arrayDeque);
        //获取但不删除双端队列的第一个元素
        System.out.println(arrayDeque.getFirst());
        //获取但不删除双端队列的最后一个元素
        System.out.println(arrayDeque.getLast());
        //获取并删除双端队列的第一个元素
        System.out.println(arrayDeque.pollFirst());
        //输出双端队列
        System.out.println(arrayDeque);
        //获取并删除双端队列的最后一个元素
        System.out.println(arrayDeque.pollLast());
        //输出双端队列
        System.out.println(arrayDeque);
    }
}
