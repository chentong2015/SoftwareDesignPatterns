package design_patterns.core_patterns.observer.demo1;

import design_patterns.core_patterns.observer.demo1.observer.ObserverA;
import design_patterns.core_patterns.observer.demo1.observer.ObserverB;
import design_patterns.core_patterns.observer.demo1.subject.Observed;

public class DemoObserverPattern {

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
