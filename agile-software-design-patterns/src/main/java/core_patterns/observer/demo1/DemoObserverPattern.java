package core_patterns.observer.demo1;

import core_patterns.observer.demo1.observer.ObserverA;
import core_patterns.observer.demo1.subject.Observed;
import core_patterns.observer.demo1.observer.ObserverB;

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
