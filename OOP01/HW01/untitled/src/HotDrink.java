public abstract class HotDrink {
    private String name;
    private int cost;
    private int volume;

    public HotDrink(String name, int cost, int volume) {
        this.name = name;
        this.cost = cost;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                ">Наименование = " + name + '<' +
                ", >Стоимость = " + cost + '<' +
                ", >Объем = " + volume + '<' +
                '}';
    }
}
