import java.util.Objects;

public class HotDrinkWithTemp extends HotDrink{
    private int temperature;

    public HotDrinkWithTemp(String name, int cost, int volume, int temperature) {
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
    public String toString() {
        return "HotDrinkWithTemp{" +
                "Наименование = " + super.getName() +
                ", Стоимость = " + super.getCost() +
                ", Объем = " + super.getVolume() +
                ", Температура = " + this.temperature +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotDrinkWithTemp that = (HotDrinkWithTemp) o;
        return temperature == that.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(temperature);
    }
}
