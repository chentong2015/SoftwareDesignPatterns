package behavior_patterns.mediator.core;

public class Light {

    private boolean isOn = false;

    public Light() {
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
    }
}
