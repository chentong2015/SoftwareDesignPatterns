package core_creation_patterns.prototype;

import core_creation_patterns.prototype.types.IBlock;

public interface IBlockFactory {

    IBlock createBlock(String content);
}
