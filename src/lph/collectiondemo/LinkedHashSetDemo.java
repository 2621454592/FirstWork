package lph.collectiondemo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author liph
 * @date 2020/5/14 - 16:35
 */
/*  1.键盘录入一个字符串，去掉其中重复字符
    2.打印出不同的那些字符，必须保证顺序。例如输入：aaaabbbcccddd，打印结果为：abcd。*/
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        //创建LinkedHashSet集合
        Set<Character> set=new LinkedHashSet<>();
        //获取键盘输入
        Scanner sc=new Scanner(System.in);
        //将键盘输入的字符串转化字符数组
        char[] chars = sc.next().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]); //添加至LinkedHashSet集合中
        }
        //遍历输出
        for (Character character : set) {
            System.out.print(character);
        }
    }
}
