package design_patterns.core_patterns.strategy.inheritance;

import design_patterns.core_patterns.strategy.base.Employee;
import design_patterns.core_patterns.strategy.base.TaxCalculator;

// 在没有改变TaxCalculator类型的情况下，增加新的逻辑功能的实现
// 使用继承会形成强依赖的关系，不利于解耦
public class NewTaxCalculator extends TaxCalculator {

    @Override
    public double calculate(Employee employee) {
        double tax = employee.getWorkDays() * 2.0 + 10;
        return tax;
    }
}
