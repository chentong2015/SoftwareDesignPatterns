package design_patterns.core_patterns.strategy.core;

import design_patterns.core_patterns.strategy.base.Employee;

public class InternCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return 1.0;
    }
}
