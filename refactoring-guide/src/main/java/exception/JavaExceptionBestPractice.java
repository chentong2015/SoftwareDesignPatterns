package exception;

import java.io.IOException;

// TODO. Exception是所有exceptions的superclass, Exception继承自Throwable(不应该被捕获)
//       Error是所有errors的superclass，Error继承自Throwable
// - 异常捕获的规范性: 是否需要合并catch
// - 异常继承的规范性: Java类继承时override重写
// - 异常抛出的层级性: 通过Throwable cause设置它上层抛出的异常

// 在java编译阶段异常抛出的声明:
// 1. 如果方法内部抛出unchecked exception, 则不需要写在方法的主体上
// 2. 如果方法内部抛出checked exception, 则必须在方法主体上throws
public class JavaExceptionBestPractice {

    // 3. 如果方法主体上没有显式throws checked exception, 在不能放到try catch中捕获 !!
    // 4. 如果方法上抛出Exception, 则可以在try catch中捕获捕获继承它的异常类型
    public static void main(String[] args) {
        try {
            testThrow();
        } catch (IOException exception) {
            exception.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testThrow() throws Exception {
        System.out.println("test throw ");
        throw new Exception("new exception");
    }
}
