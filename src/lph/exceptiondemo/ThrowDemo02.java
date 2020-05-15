package lph.exceptiondemo;

/**
 * @author liph
 * @date 2020/5/15 - 8:45
 */
public class ThrowDemo02 {
    public static void main(String[] args) {
        String name="李四";
        try {
            if ("张三".equals(name)){
                System.out.println("登录成功");
            }else {
                //手动抛出异常
                throw new  Exception("权限不足");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
