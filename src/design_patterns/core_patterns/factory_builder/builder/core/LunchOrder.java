package design_patterns.core_patterns.factory_builder.builder.core;

// Builder模式:
// 将构建对象的过程抽象出来，提供更大的构造灵活度
// 目的是处理负责的对象构造 Handle complex constructors
// 不需要interface，可以使用内部类

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
