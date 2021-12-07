package design_patterns.core_patterns.TemplateMethod_Strategy.strategy;

public interface Application {

    void init();

    void work();

    void cleanup();

    boolean done();
}
