package core_behavior_patterns.observer.core.observer;

import core_behavior_patterns.observer.core.subject.Subject;

public class PhoneClient extends Observer {

    public PhoneClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void addMessage(String message) {
        subject.setState(message);
    }

    @Override
    public void update() {
        System.out.println(subject.getState());
    }
}
