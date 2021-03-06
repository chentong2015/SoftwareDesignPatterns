package design_patterns.other_patterns.prototype;

import design_patterns.other_patterns.prototype.types.IBlock;

public interface IBlockFactory {

    IBlock createBlock(String content);
}
