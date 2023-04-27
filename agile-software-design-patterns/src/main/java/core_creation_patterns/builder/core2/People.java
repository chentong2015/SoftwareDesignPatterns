package core_creation_patterns.builder.core2;

public class People {

    // PeopleBuilder
    // 这里返回的Builder需要实现其中定义的抽象方法
    public static Builder builder() {
        return new Builder() {
            @Override
            public Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Builder<T>> {

        private String name;
        private int age;

        // TODO: 因为这里的方法一定会被Builder<T>的继承类所实现的
        //  所以这里可以使用该方法来获取到继承类型的this，从而继续build的过程
        public abstract T getThis();

        public People build() {
            return new People(this);
        }

        public T name(String name) {
            this.name = name;
            return this.getThis();
        }

        public T age(int age) {
            this.age = age;
            return this.getThis();
        }
    }

    private String name;
    private int age;

    // TODO: 这里的泛型使用通配符来使用，无论其实现的类型如何
    //   这里设置成protected也是为了被继承类型调用，完成基本属性的初始化
    protected People(Builder<?> builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "name: " + this.name + ", age: " + this.age;
    }
}
