package design_patterns.core_patterns.strategy.demo1;

public class CreditCard {

    private String number;
    private String date;
    private String cvv;
    private ValidationStrategy strategy;

    // 在构造器中使用抽象类型，可以在创建CreditCard实例时使用定义好的不同策略
    // 通过Strategy模式实现ValidationStrategy不同实现实例的使用
    public CreditCard(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isValid() {
        return strategy.isValid(this);
    }

    public String getNumber() {
        return number;
    }
}
