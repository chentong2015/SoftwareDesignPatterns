package core_patterns.prototype;

import core_patterns.prototype.types.IBlock;

public interface IBlockFactory {

    IBlock createBlock(String content);
}
