package design_patterns.core_patterns.builder.core2;

public class Student extends People {

    // 返回一个Builder的实例，用于构造Student的对象
    public static Builder builder() {
        return new Builder();
    }

    // StudentBuilder
    public static class Builder extends People.Builder<Builder> {

        private String school;

        @Override
        public Builder getThis() {
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        public Builder school(String school) {
            this.school = school;
            return this;
        }
    }

    private String school;

    public Student(Builder builder) {
        super(builder);
        this.school = builder.school;
    }

    @Override
    public String toString() {
        return super.toString() + ", school: " + this.school;
    }
}
