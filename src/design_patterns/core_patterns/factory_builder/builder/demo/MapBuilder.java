package design_patterns.core_patterns.factory_builder.builder.demo;

import java.util.HashMap;
import java.util.Map;

public class MapBuilder implements IKeyValueCollectionBuilder {

    private Map<String, String> map;

    public MapBuilder() {
        map = new HashMap<>();
    }

    @Override
    public IKeyValueCollectionBuilder add(String key, String value) {
        map.put(key, value);
        return this;
    }

    public Map<String, String> build() {
        return map;
    }
}
