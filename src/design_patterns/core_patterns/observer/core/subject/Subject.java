package design_patterns.core_patterns.observer.core.subject;

import design_patterns.core_patterns.observer.core.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public abstract void setState(String message);

    public abstract String getState();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
