package lph.exceptiondemo;

/**
 * @author liph
 * @date 2020/5/15 - 12:13
 */
public class B {
    public static void main(String[] args) {
        A a=new A();
        try {
            a.printName();//调用方法必须处理异常
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
