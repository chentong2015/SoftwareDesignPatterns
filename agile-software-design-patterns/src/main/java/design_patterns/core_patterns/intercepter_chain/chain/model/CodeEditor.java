package design_patterns.core_patterns.intercepter_chain.chain.model;

public class CodeEditor implements IKeyHandler {

    IKeyHandler handlerUp;

    public CodeEditor(IKeyHandler handler) {
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
