package core_patterns.chain_of_responsibility.model2;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(LoggerLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
