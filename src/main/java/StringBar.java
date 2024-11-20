public class StringBar extends Bar {
    boolean HappyHour;

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
}
