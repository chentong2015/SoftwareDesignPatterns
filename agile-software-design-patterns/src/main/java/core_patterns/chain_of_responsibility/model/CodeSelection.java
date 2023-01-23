package core_patterns.chain_of_responsibility.model;

public class CodeSelection implements IKeyHandler {

    IKeyHandler handlerUp;

    public CodeSelection(IKeyHandler handler) {
        this.handlerUp = handler;
    }

    @Override
    public void handleInputKey(String key) {
        if (key.equals("Alt+F4")) {
            System.out.println("Close IWork");
        } else {
            handlerUp.handleInputKey(key);
        }
    }
}
