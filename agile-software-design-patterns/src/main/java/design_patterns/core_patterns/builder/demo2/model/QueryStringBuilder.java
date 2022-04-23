package design_patterns.core_patterns.builder.demo2.model;

public class QueryStringBuilder implements IKeyValueCollectionBuilder {

    private StringBuilder queryString;

    public QueryStringBuilder() {
        queryString = new StringBuilder();
    }

    @Override
    public IKeyValueCollectionBuilder add(String key, String value) {
        queryString.append(queryString.length() == 0 ? "?" : "&");
        queryString.append(key);
        queryString.append('=');
        queryString.append(value);
        return this;
    }

    public String build() {
        return queryString.toString();
    }
}
