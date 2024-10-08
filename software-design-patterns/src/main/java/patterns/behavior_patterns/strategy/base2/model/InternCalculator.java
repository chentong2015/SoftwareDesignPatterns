package patterns.behavior_patterns.strategy.base2.model;

import patterns.behavior_patterns.strategy.base1.model.Employee;

public class InternCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return 1.0;
    }
}
