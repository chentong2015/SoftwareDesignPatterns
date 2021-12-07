package design_patterns.core_patterns.observer;

import design_patterns.core_patterns.observer.model.Observed;
import design_patterns.core_patterns.observer.model.ObserverA;
import design_patterns.core_patterns.observer.model.ObserverB;

public class DemoObserver {

    public void testObserverPattern() {
        Observed observedObject = new Observed();
        ObserverA observerA = new ObserverA(observedObject);
        ObserverB observerB = new ObserverB(observedObject);
        // 注册: 指定观察者观察"被观察者"
        observedObject.register(observerA);
        observedObject.register(observerB);
        observedObject.change();
    }
}
