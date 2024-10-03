package patterns.behavior_patterns.strategy.base2.model;

import patterns.behavior_patterns.strategy.base1.model.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);
}
