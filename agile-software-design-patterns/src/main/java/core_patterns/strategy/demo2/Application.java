package core_patterns.strategy.demo2;

public interface Application {

    void init();

    void work();

    void cleanup();

    boolean done();
}
