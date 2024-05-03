package behavior_patterns.mediator.timer.task;

import java.util.TimerTask;

public class RemindTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Time is up");
    }
}
