package core_behavior_patterns.strategy.demo2;

public class StrategyPatternDemo {

    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new BadWorker());
        context.run();
    }
}
