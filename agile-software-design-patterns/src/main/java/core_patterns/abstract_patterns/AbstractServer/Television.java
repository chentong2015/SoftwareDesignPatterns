package core_patterns.abstract_patterns.AbstractServer;

public class Television implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Turn on the television");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the television");
    }
}
