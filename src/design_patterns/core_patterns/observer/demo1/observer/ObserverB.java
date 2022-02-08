package design_patterns.core_patterns.observer.demo1.observer;

import design_patterns.core_patterns.observer.demo1.subject.Observed;

public class ObserverB implements Observer {

    private Observed observed;

    public ObserverB(Observed observed) {
        this.observed = observed;
    }

    @Override
    public void update() {
        System.out.println("Update ObserverB = " + observed.getSecretNumber());
    }
}
