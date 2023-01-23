package core_patterns.chain_of_responsibility.model2;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(LoggerLevel level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
