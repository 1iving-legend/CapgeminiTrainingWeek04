package personalized_meal_plan_generator;


public class PersonalizedMealPlanGenerator {

    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealPlan) {
        System.out.println("Generating meal plan...");
        return new Meal<>(mealPlan);
    }

    public static void main(String[] args) {

        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();


        Meal<VegetarianMeal> meal1 = generateMealPlan(vegetarianMeal);
        Meal<VeganMeal> meal2 = generateMealPlan(veganMeal);
        Meal<KetoMeal> meal3 = generateMealPlan(ketoMeal);
        Meal<HighProteinMeal> meal4 = generateMealPlan(highProteinMeal);


        System.out.println("\nPersonalized personalized_meal_plan_generator.Meal Plans:");
        meal1.displayMealDetails();
        meal2.displayMealDetails();
        meal3.displayMealDetails();
        meal4.displayMealDetails();
    }
}
