package design_patterns.core_patterns.strategy.core.model;

import design_patterns.core_patterns.strategy.base.model.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);
}
