package design_patterns.core_patterns.factory_builder.builder.mybatis;

public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private String configName;

    public DefaultSqlSessionFactory(String config) {
        this.configName = config;
    }
}
