package design_patterns.core_patterns.strategy.core.impl;

import design_patterns.core_patterns.strategy.base.model.Employee;
import design_patterns.core_patterns.strategy.core.model.TaxCalculator;

public class InternCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return 1.0;
    }
}
