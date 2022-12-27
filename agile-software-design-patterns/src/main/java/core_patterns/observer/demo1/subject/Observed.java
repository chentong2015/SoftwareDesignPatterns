package core_patterns.observer.demo1.subject;

public class Observed extends Subject {

    private int secretNumber = 10;

    // 在任何时候，被观察者发生变化时，立即通过其所有的注册观察者
    public void change() {
        System.out.println("Observed Object changes ...");
        secretNumber++;
        notifyAllObservers();
    }

    // 观察者从被观察者中"拉出数据"
    public int getSecretNumber() {
        return secretNumber;
    }
}
