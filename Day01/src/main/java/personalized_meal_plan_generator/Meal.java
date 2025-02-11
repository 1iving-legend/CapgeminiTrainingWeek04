package personalized_meal_plan_generator;

public class Meal<T extends MealPlan> {
    private T mealType;

    public Meal(T mealType) {
        this.mealType = mealType;
    }

    public void displayMealDetails() {
        System.out.println(mealType.getMealDetails());
    }
}
