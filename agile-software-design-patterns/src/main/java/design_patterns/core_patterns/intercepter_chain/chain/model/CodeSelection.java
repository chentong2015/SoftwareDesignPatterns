package design_patterns.core_patterns.intercepter_chain.chain.model;

public class CodeSelection implements IKeyHandler {

    IKeyHandler handlerUp;

    public CodeSelection(IKeyHandler handler) {
        this.handlerUp = handler;
    }

    @Override
    public void handleInputKey(String key) {
        if (key.equals("Alt+F4")) {
            System.out.println("Close Application");
        } else {
            handlerUp.handleInputKey(key);
        }
    }
}
