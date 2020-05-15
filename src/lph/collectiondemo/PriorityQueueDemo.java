package lph.collectiondemo;

import java.util.PriorityQueue;

/**
 * @author liph
 * @date 2020/5/14 - 15:42
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        //创建队列
        PriorityQueue priorityQueue=new PriorityQueue();
        //将指定元素插入此队列的尾部
        priorityQueue.offer(2);
        priorityQueue.add(-3);
        priorityQueue.add(6);
        priorityQueue.offer(18);
        //输出队列
        System.out.println(priorityQueue);
        //获取队列头部的元素，但是不删除该元素。
        System.out.println(priorityQueue.element());
        //返回队列头部的元素，但是不删除该元素。
        System.out.println(priorityQueue.peek());
        //返回队列头部的元素，并删除该元素。
        System.out.println(priorityQueue.poll());
        //输出队列
        System.out.println(priorityQueue);

    }
}
