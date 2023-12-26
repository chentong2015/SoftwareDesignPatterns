package core_behavior_patterns.memento.model;

import java.util.ArrayList;
import java.util.List;

public class MementoContainer {

    private final List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    public Memento get(int index) {
        return mementos.get(index);
    }
}
