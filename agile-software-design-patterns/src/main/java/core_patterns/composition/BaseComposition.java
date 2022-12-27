package core_patterns.composition;

// Composition 组合: 一种关系模型
public class BaseComposition {

    // 之间包含并依赖于某类型
    private BaseComponent component;

    public BaseComposition(BaseComponent component) {
        this.component = component;
    }

    public void testComposition() {
        component.doSomething();
    }
}
