package design_patterns.core_patterns.factory_builder.builder.demo;

public class HttpHeaderBuilder implements IKeyValueCollectionBuilder {

    private StringBuilder httpHeader;

    public HttpHeaderBuilder() {
        httpHeader = new StringBuilder();
    }

    @Override
    public IKeyValueCollectionBuilder add(String key, String value) {
        httpHeader.append(key);
        httpHeader.append(':');
        httpHeader.append(value);
        return this;
    }

    public String build() {
        return httpHeader.toString();
    }
}
