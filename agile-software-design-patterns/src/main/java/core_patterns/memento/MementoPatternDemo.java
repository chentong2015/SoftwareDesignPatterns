package core_patterns.memento;

import core_patterns.memento.model.MementoContainer;
import core_patterns.memento.model.Originator;

public class MementoPatternDemo {

    public static void main(String[] args) {
        MementoContainer container = new MementoContainer();

        Originator originator = new Originator();
        originator.setState("State #1");
        originator.setState("State #2");
        container.add(originator.saveStateToMemento());
        originator.setState("State #3");
        container.add(originator.saveStateToMemento());
        originator.setState("State #4");
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(container.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(container.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
}
