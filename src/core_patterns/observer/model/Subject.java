package core_patterns.observer.model;

import java.util.ArrayList;
import java.util.List;

// 观察者通过Subject抽象类注册到被观察者中
public abstract class Subject {

    List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);

    }

    protected void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
