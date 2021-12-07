package design_patterns.core_patterns.observer.model;

public class ObserverA implements Observer {

    private Observed observed;

    public ObserverA(Observed observed) {
        this.observed = observed;
    }

    @Override
    public void update() {
        System.out.println("Update ObserverA = " + observed.getSecretNumber());
    }
}
