public class StringBar extends Bar {
    boolean HappyHour;

    public StringBar() {
        this.HappyHour = false;
    }

    @Override
     public boolean isHappyHour(){
        return HappyHour;
    }

    @Override
    public void startHappyHour() {
        this.HappyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        this.HappyHour = false;
        notifyObservers();
    }

    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}
