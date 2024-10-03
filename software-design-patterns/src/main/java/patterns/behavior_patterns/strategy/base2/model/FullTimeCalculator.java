package patterns.behavior_patterns.strategy.base2.model;

import patterns.behavior_patterns.strategy.base1.model.Employee;

public class FullTimeCalculator implements TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        return employee.getWorkDays() * 1.5 + 100;
    }
}
