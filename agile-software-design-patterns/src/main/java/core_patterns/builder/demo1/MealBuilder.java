package core_patterns.builder.demo1;

import core_patterns.builder.demo1.impl.ChickenBurger;
import core_patterns.builder.demo1.impl.Coke;
import core_patterns.builder.demo1.impl.Pepsi;
import core_patterns.builder.demo1.impl.VegBurger;

// 通过Builder逐步的构建对象，并且独立于构建出来的对象
// A Builder class builds the final object step by step.
// This builder is independent of other objects.
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
