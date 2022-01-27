package design_patterns.core_patterns.strategy.core;

import design_patterns.core_patterns.strategy.base.Employee;

public class PartTimeCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return employee.getWorkDays() * 1.0 + 50;
    }
}
