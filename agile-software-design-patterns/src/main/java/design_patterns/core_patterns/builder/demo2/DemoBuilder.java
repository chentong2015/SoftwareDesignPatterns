package design_patterns.core_patterns.builder.demo2;

import design_patterns.core_patterns.builder.demo2.model.HttpHeaderBuilder;
import design_patterns.core_patterns.builder.demo2.model.IKeyValueCollectionBuilder;
import design_patterns.core_patterns.builder.demo2.model.MapBuilder;
import design_patterns.core_patterns.builder.demo2.model.QueryStringBuilder;

// TODO: 将对象构建的过程抽象出来，通过统一的接口完成构造
public class DemoBuilder {

    public static void main(String[] args) {
        QueryStringBuilder builder = new QueryStringBuilder();
        HttpHeaderBuilder builder1 = new HttpHeaderBuilder();
        MapBuilder builder2 = new MapBuilder();
        processConstruction(builder);
        // 使用不同的builder构建出来的结果格式可能不同
        builder.build();
    }

    // add()方法返回IKeyValueCollectionBuilder接口，可以继续调用，进行构造
    public static void processConstruction(IKeyValueCollectionBuilder builder) {
        builder.add("make", "lada")
                .add("color", "red")
                .add("year", "2021");
    }
}
