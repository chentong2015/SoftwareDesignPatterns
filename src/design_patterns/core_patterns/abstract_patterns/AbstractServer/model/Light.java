package design_patterns.core_patterns.abstract_patterns.AbstractServer.model;

public class Light implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Turn on the light");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off the light");
    }
}
