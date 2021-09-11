package other_patterns.prototype;

import other_patterns.prototype.types.IBlock;

public interface IBlockFactory {

    IBlock createBlock(String content);
}
