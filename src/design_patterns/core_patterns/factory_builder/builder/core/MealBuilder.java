package design_patterns.core_patterns.factory_builder.builder.core;

import design_patterns.core_patterns.factory_builder.builder.core.impl.ChickenBurger;
import design_patterns.core_patterns.factory_builder.builder.core.impl.Coke;
import design_patterns.core_patterns.factory_builder.builder.core.impl.Pepsi;
import design_patterns.core_patterns.factory_builder.builder.core.impl.VegBurger;

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
