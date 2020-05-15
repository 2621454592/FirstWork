package lph.exceptiondemo;

/**
 * @author liph
 * @date 2020/5/15 - 8:40
 */
public class Demo01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try { // try监控区域
            if (b == 0) throw new ArithmeticException(); // 通过throw语句抛出异常
            System.out.println("a/b的值是：" + a / b);
        }
        catch (ArithmeticException e) { // catch捕捉异常
            System.out.println("程序出现异常，除数不能为0！");
        }finally {
            System.out.println("程序正常结束。");
        }

    }
}
