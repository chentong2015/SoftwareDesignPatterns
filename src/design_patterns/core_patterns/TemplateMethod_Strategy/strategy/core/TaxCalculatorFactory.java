package design_patterns.core_patterns.TemplateMethod_Strategy.strategy.core;

import design_patterns.core_patterns.TemplateMethod_Strategy.base.Employee;
import design_patterns.core_patterns.TemplateMethod_Strategy.base.FullTimeEmployee;
import design_patterns.core_patterns.TemplateMethod_Strategy.base.PartTimeEmployee;

// 使用工厂模式来构建指定的实例对象
// 1. 工程模式同样需要建立Factory interface
// 2. 对于每一个新增，只需要添加一个新的类型，而不会对原有的架构造影响
public class TaxCalculatorFactory {

    public static TaxCalculator create(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeCalculator();
        } else if (employee instanceof PartTimeEmployee) {
            return new PartTimeCalculator();
        } else {
            return new InternCalculator();
        }
    }
}
