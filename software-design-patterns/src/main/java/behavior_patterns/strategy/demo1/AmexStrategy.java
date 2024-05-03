package behavior_patterns.strategy.demo1;

public class AmexStrategy extends ValidationStrategy {

    @Override
    protected boolean isValid(CreditCard creditCard) {
        return creditCard.getNumber().startsWith("34");
    }
}
