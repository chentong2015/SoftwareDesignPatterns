package core_patterns.observer;

import core_patterns.observer.model.Observed;
import core_patterns.observer.model.ObserverA;
import core_patterns.observer.model.ObserverB;

public class DemoObserver {
    
    public void testObserverPattern() {
        Observed observedObject = new Observed();
        ObserverA observerA = new ObserverA(observedObject);
        ObserverB observerB = new ObserverB(observedObject);
        observedObject.register(observerA);
        observedObject.register(observerB);
        observedObject.change();
    }
}
