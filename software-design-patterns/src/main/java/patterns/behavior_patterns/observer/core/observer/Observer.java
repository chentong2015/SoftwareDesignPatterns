package patterns.behavior_patterns.observer.core.observer;

import patterns.behavior_patterns.observer.core.subject.Subject;

public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
