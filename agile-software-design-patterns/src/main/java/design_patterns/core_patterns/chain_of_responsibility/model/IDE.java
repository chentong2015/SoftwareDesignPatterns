package design_patterns.core_patterns.chain_of_responsibility.model;

public class IDE implements IKeyHandler {

    @Override
    public void handleInputKey(String key) {
        if (key.equals("Ctrl+F")) {
            System.out.println("Full Search");
        } else if (key.equals("Alt+F4")) {
            System.out.println("Close Application");
        } else {
            System.out.println("Can not handle it");
        }
    }
}
