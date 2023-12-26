package core_behavior_patterns.strategy.base2.model;

import core_behavior_patterns.strategy.base1.model.Employee;

public class InternCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return 1.0;
    }
}
