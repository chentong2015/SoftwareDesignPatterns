package core_creation_patterns.builder.project;

public interface IXADataSource extends IDataSource {

    String getXAUsage();

    class Builder extends IDataSource.Builder<Builder> {

        public Builder(String dbConfig) {
            super(dbConfig);
        }

        // 重写父类的build()方法，构建接口的指定实现的类型IXADataSourceImpl
        public IXADataSource build() {
            return new IXADataSource() {
                @Override
                public String getXAUsage() {
                    return null;
                }

                @Override
                public String getDBConfig() {
                    return null;
                }

                @Override
                public boolean isHighAvailable() {
                    return false;
                }
            };
        }
    }
}
