package design_patterns.core_patterns.factory_builder.builder.core;

public class PatternBuilderDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        // 构建自定义需要的Meal
        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
