package patterns.behavior_patterns.strategy.demo2;

public class GoodWorker implements IWork {

    @Override
    public void init() {
        System.out.println("good start");
    }

    @Override
    public void work() {
        System.out.println("good work");
    }

    @Override
    public void cleanup() {
        System.out.println("well done");
    }
}
