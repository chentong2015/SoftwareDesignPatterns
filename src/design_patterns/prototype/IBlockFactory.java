package design_patterns.prototype;

import design_patterns.prototype.types.IBlock;

public interface IBlockFactory {

    IBlock createBlock(String content);
}
