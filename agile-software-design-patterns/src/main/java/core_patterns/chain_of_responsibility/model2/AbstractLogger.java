package core_patterns.chain_of_responsibility.model2;

public abstract class AbstractLogger {

    protected LoggerLevel level;

    // 指向责任链上的下一个element
    // next element in chain or responsibility
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // 日志输出的逻辑: 低于指定level参数的Logger都会处理message的输出
    public void logMessage(LoggerLevel level, String message) {
        if (this.level.ordinal() <= level.ordinal()) {
            write(message);
        }
        // 调用责任链上的下一个logger
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
