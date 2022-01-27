package design_patterns.core_patterns.strategy.core;

import design_patterns.core_patterns.strategy.base.Employee;

public class FullTimeCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return employee.getWorkDays() * 1.5 + 100;
    }
}
