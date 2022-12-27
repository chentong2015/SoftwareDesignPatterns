package core_patterns.strategy.core.model;

import core_patterns.strategy.base.model.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);
}
