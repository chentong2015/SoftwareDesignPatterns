package core_patterns.prototype.types;

public class NumberBlock implements IBlock {

    private int number;

    public NumberBlock(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public IBlock copy() {
        return new NumberBlock(number);
    }
}
