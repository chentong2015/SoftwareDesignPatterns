package design_patterns.basic_patterns.api;

public class BaseChangingAPIs {

    // 1. Do not change existing public contracts: data classes, signatures
    // 2. Expose abstractions to customers and let them add new features;

    public double calculate(Object employee) {
        // business logic
        return 0D;
    }

    // 对于改变frameworks中开放出来的接口API, 会对客户端的使用造成影响
    public double calculate(Object employee, String currency) {
        // business logic
        return 0D;
    }

    //
}
