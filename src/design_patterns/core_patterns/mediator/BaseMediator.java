package design_patterns.core_patterns.mediator;

import design_patterns.core_patterns.mediator.timer.task.RemindTask;
import design_patterns.core_patterns.mediator.timer.task.RemindTaskWithoutBeep;

import java.util.Timer;

// Mediator
// 1. One-to-one to many
// 2. Decoupled
// 3. Complex Communication
// 4. Hub/Router

// 定义两个对象之间如何在不refer to each other的情况下interact交互
// TODO: 解除对象之间耦合, 调节对象之间的交互和schedule
// java.util.Timer
public class BaseMediator {

    private static Timer timer;

    // RemindTask和RemindTaskWithoutBeep对象在完全不知道彼此的情况下
    // 完全由Timer的schedule方法来负责调度
    public static void testMediatorEveryday(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000L);
        timer.schedule(new RemindTaskWithoutBeep(), seconds * 2000L);
    }

    public static void main(String[] args) {
        testMediatorEveryday(3);
    }
}
