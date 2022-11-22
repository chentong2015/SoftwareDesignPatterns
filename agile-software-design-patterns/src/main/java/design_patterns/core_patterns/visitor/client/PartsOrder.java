package design_patterns.core_patterns.visitor.client;

import design_patterns.core_patterns.visitor.base.AtvPart;
import design_patterns.core_patterns.visitor.visitor.AtvPartVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private List<AtvPart> partList = new ArrayList<>();

    public void addPart(AtvPart part) {
        partList.add(part);
    }

    public List<AtvPart> getPartList() {
        return Collections.unmodifiableList(partList);
    }

    // TODO: Visitor模式使用规范
    // 1. 所有的AtvPart都accept()同一个具体的AtvPartVisitor
    // 2. 所有的AtvPart accept()方法中都调用重载方法中的一个，实现各种的逻辑
    // 3. 数据结构的呈现和数据的使用(具体算法)之间相互独立
    @Override
    public void accept(AtvPartVisitor visitor) {
        for (AtvPart part : partList) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
