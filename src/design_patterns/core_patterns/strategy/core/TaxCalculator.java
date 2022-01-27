package design_patterns.core_patterns.strategy.core;

import design_patterns.core_patterns.strategy.base.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);
}
