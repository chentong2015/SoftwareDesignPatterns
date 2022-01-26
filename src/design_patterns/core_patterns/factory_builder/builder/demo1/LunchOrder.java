package design_patterns.core_patterns.factory_builder.builder.demo1;

// TODO: Builder模式使用规则
// 将构建对象的过程抽象出来，提供更大的构造灵活度
// 1. The builder pattern is a creational pattern, not a behavioral pattern !!
//    目的是处理负责的对象构造, 而不是行为
// 2. The builder pattern solves the problem of maintaining a class with too many constructors
//    when you need to build an object which requires multiple properties some optional and some mandatory
// 3. The constructor of the class being built should be made private to prevent outsider access
// 4. The set methods of a builder pattern should return the Builder object (this) !!
// 5. 可以使用内部类, 但不需要interface

// StringBuilder
// DocumentBuilder: for complex object creation
// LocaleBuilder
public class LunchOrder {

    // 通过内部类来提供对象(属性)的构造
    // TODO: 使用时可以任意组合要设置的属性值, 而无需存在相应的构造函数
    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {

        }

        public LunchOrder build() {
            return new LunchOrder(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }

    // 保证类型的属性值不会改变
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    // TODO: 构造器需要设置成private, 防止外部的访问
    // 只能通过内部的Builder来构建对象
    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    // 只提供get方法，保证immutable
    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
