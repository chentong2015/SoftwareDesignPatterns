package design_patterns.core_patterns.TemplateMethod_Strategy.strategy.core;

import design_patterns.core_patterns.TemplateMethod_Strategy.base.Employee;

public class InternCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return 1.0;
    }
}
