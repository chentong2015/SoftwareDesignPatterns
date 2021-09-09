package design_patterns.prototype;

import design_patterns.prototype.types.ContentBlock;
import design_patterns.prototype.types.DataTimeBlock;
import design_patterns.prototype.types.IBlock;
import design_patterns.prototype.types.NumberBlock;

import java.time.LocalDateTime;

public class IBlockFactoryImpl implements IBlockFactory {

    @Override
    public IBlock createBlock(String content) {
        if (content.contains("/") || content.contains("-")) {
            // 需要格式化读取的日期字符串
            return new DataTimeBlock(LocalDateTime.parse(content));
        } else if (isNumber(content)) {
            return new NumberBlock(Integer.parseInt(content));
        } else {
            return new ContentBlock(content);
        }
    }

    private boolean isNumber(String content) {
        try {
            Integer.parseInt(content);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
