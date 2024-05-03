package behavior_patterns.visitor.visitor;

import behavior_patterns.visitor.model.Keyboard;
import behavior_patterns.visitor.model.Monitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor: another algo");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard: another algo");
    }
}
