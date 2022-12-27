package core_patterns.proxy.dynamic_proxy.model;

public interface Person {

    boolean setName(String name);

    String getName();

    void work(String name, String place);
}
