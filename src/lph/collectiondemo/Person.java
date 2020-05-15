package lph.collectiondemo;

/**
 * @author liph
 * @date 2020/5/14 - 16:22
 */
public class Person implements Comparable{
    private int sno;
    private String sname;

    public Person(){}
    public Person(int sno){
        this.sno = sno;
    }
    public Person(int sno, String sname){
        this.sno = sno;
        this.sname = sname;
    }

    public int getSno(){
        return sno;
    }

    public String getSname(){
        return sname;
    }
    //重写toString方法
    public String toString(){
        return sno + "," +sname;
    }
   //重写compareTo方法
    public int compareTo(Object o){
        Person stu = null;
        //若对象o为Student类型则赋予
        if(o instanceof Person){
            stu = (Person)o;
        }
        return sno - stu.getSno();//返回值有3种：>0 =0 <0代表比较结果
    }
}
