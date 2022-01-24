package design_patterns.core_patterns.factory_builder.builder.core;

import design_patterns.core_patterns.factory_builder.builder.core.impl.ChickenBurger;
import design_patterns.core_patterns.factory_builder.builder.core.impl.Coke;
import design_patterns.core_patterns.factory_builder.builder.core.impl.Pepsi;
import design_patterns.core_patterns.factory_builder.builder.core.impl.VegBurger;

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
