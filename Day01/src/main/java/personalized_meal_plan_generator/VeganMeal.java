package personalized_meal_plan_generator;

public class VeganMeal implements MealPlan {
    @Override
    public String getMealDetails() {
        return "Vegan personalized_meal_plan_generator.Meal: Includes plant-based foods only.";
    }
}
