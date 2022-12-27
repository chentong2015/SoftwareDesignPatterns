package core_patterns.observer.core.observer;

import core_patterns.observer.core.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
