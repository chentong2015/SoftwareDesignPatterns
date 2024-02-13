package core_behavior_patterns.visitor.visitor;

import core_behavior_patterns.visitor.model.Keyboard;
import core_behavior_patterns.visitor.model.Monitor;

public class ComputerPartBaseVisitor implements ComputerPartVisitor {

    double amount = 0;

    @Override
    public void visit(Monitor monitor) {
        amount += 3.0;
    }

    @Override
    public void visit(Keyboard keyboard) {
        amount += 5.0;
    }
}
