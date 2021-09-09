package design_patterns.prototype;

import design_patterns.prototype.types.IBlock;

import java.util.ArrayList;
import java.util.List;

// Prototype 原型:
// TODO: 将类型本身作为原型，在需要的时候复制出一份对象的副本(深度拷贝)
//       注意：直接使用Object clone()方法是属于浅拷贝
// 1. 构建一个包含copy()或者clone()方法的接口
// 2. 实现该接口的类型需要实现上面方法，根据对象本身的状态复制出一份对象，并返回

// 应用场景: Excel的单元格独立Copy，包含原始单元的属性状态信息
public class BasePrototype {

    public static void main(String[] args) {
        IBlockFactory blockFactory = new IBlockFactoryImpl();
    }

    private static void testPrototypePatterns(IBlockFactory blockFactory) {
        List<IBlock> cells = new ArrayList<>();
        cells.add(blockFactory.createBlock("hello world"));
        cells.add(blockFactory.createBlock("10"));
        cells.add(blockFactory.createBlock("10/09/2021"));

        // 直接调用对象的方法来复制自身
        IBlock baseBlock = cells.get(1);
        cells.add(baseBlock.copy());
    }
}
