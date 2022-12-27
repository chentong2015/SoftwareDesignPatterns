package core_patterns.strategy.core.impl;

import core_patterns.strategy.base.model.Employee;
import core_patterns.strategy.core.model.TaxCalculator;

public class InternCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return 1.0;
    }
}
