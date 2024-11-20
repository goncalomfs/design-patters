import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy {
    private List<DrinkOrder> drinkOrders = new ArrayList<>();

    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        drinkOrders.add(new DrinkOrder(drink, recipe));
    }

    public void happyHourStarted(StringBar bar) {
        for (DrinkOrder drinkorder : drinkOrders) {
            bar.order(drinkorder.drink, drinkorder.recipe);
        }
        drinkOrders.clear();
    }

    public void happyHourEnded(StringBar bar) {
    }

    private static class DrinkOrder {
        StringDrink drink;
        StringRecipe recipe;

        DrinkOrder(StringDrink drink, StringRecipe recipe) {
            this.drink = drink;
            this.recipe = recipe;
        }
    }
}
