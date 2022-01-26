package design_patterns.core_patterns.TemplateMethod_Strategy.strategy.core;

import design_patterns.core_patterns.TemplateMethod_Strategy.base.Employee;

public interface TaxCalculator {

    double calculate(Employee employee);
}
