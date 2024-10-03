package patterns.creation_patterns.prototype;

import patterns.creation_patterns.prototype.types.IBlock;

public interface IBlockFactory {

    IBlock createBlock(String content);
}
