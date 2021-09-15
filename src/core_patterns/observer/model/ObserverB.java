package core_patterns.observer.model;

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
