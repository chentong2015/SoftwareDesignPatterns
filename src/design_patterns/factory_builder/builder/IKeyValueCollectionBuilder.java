package design_patterns.factory_builder.builder;

public interface IKeyValueCollectionBuilder {

    IKeyValueCollectionBuilder add(String key, String value);
}
