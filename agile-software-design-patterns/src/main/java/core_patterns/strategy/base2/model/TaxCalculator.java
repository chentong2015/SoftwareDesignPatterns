package core_patterns.strategy.base2.model;

import core_patterns.strategy.base1.model.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);
}
