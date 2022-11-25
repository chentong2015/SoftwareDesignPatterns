package exception;

// 如何捕获并处理异常: 捕获Throwable，根据不同的异常类型执行不同的逻辑
public class JavaExceptionHandler {

    public boolean test() {
        boolean failed = false;
        try {
            // mock throw exception
        } catch (Throwable throwable) {
            failed = handleException(throwable);
        }
        return failed;
    }

    private boolean handleException(Throwable th) {
        boolean failed = true;
        Throwable cause = th.getCause();
        if (cause instanceof ExceptionInInitializerError) {
            // LogFactory.getLog(getClass()).error(buffer.toString());
            failed = false;
        } else {
            // if (th instanceof BuildWarning) {
            //     LogFactory.getLog(getClass()).warn(cause);
            // }
        }
        return failed;
    }
}
