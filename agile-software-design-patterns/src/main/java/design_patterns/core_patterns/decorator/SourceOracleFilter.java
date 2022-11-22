package design_patterns.core_patterns.decorator;

public class SourceOracleFilter extends Filter {

    private final Filter decorator;

    public SourceOracleFilter(Filter decorator) {
        this.decorator = decorator;
    }

    @Override
    public void updateAttributes() {
        decorator.updateAttributes();
        // 过滤从Oracle中提取的数据
    }
}
