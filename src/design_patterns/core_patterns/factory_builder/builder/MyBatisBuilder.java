package design_patterns.core_patterns.factory_builder.builder;

import design_patterns.core_patterns.factory_builder.builder.MyBatis.DefaultSqlSessionFactory;
import design_patterns.core_patterns.factory_builder.builder.MyBatis.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// 当构造对象的参数比较多时，将全部的可能的构造抽离出来，统一构造
public class MyBatisBuilder {

    public SqlSessionFactory build(InputStream inputStream) {
        return build(inputStream, null, null);
    }

    public SqlSessionFactory build(InputStream inputStream, String environment) {
        return build(inputStream, environment, null);
    }

    public SqlSessionFactory build(InputStream inputStream, Properties properties) {
        return build(inputStream, null, properties);
    }

    public SqlSessionFactory build(InputStream inputStream, String environment, Properties properties) {
        try {
            // XMLConfigBuilder parser = new XMLConfigBuilder(inputStream, environment, properties);
            // return build(parser.parse());
            return build();
        } catch (Exception e) {
            // throw ExceptionFactory.wrapException("Error building SqlSession.", e);
            return null;
        } finally {
            // ErrorContext.instance().reset();
            try {
                inputStream.close();
            } catch (IOException e) {
                // Intentionally ignore. Prefer previous error.
            }
        }
    }

    public SqlSessionFactory build() {
        return new DefaultSqlSessionFactory("config");
    }
}
