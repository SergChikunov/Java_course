import java.util.Objects;

public class CupOfCoffe extends HotDrink{
    private int temperature;

    public CupOfCoffe(String name, int cost, int volume) {
        super(name, cost, volume);
    }

    public CupOfCoffe(String name, int cost, int volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof HotDrink)) return false;
        CupOfCoffe that = (CupOfCoffe) obj;
        return super.getName().equalsIgnoreCase(that.getName())
                && super.getCost() == that.getCost()
                && super.getVolume() == that.getVolume()
                && getTemperature() == that.getTemperature();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperature);
    }
}
