package core_patterns.null_object;

import core_patterns.null_object.demo.AbstractCustomer;
import core_patterns.null_object.demo.CustomerFactory;

// Null Object: 避免程序中由于检测null所造成的异常
// 使用该模式，确保方法中返回有效的对象，即使失败，也返回"什么都不做的"的对象
public class NullObject {

    // 1. 如果返回返回的是集合，最好使用Collections.emptySet;
    // 2. 如果返回的映射，最好使用Collections.emptyMap;
    // 3. 对于返回的数组，最好返回零长度的数组

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}
