package design_patterns.core_patterns.TemplateMethod_Strategy.strategy;

public class ApplicationImpl implements Application {
    @Override
    public void init() {
        // init
    }

    @Override
    public void work() {
        // work
    }

    @Override
    public void cleanup() {
        // clean up
    }

    @Override
    public boolean done() {
        return false;
    }
}
