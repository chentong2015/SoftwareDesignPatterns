package design_patterns.core_patterns.factory_builder.builder.demo2.model;

public interface IKeyValueCollectionBuilder {

    IKeyValueCollectionBuilder add(String key, String value);
}