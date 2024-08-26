import java.util.List;

public class CupOfCoffeAutomate implements HotDrinksAutomate{

    private final List<HotDrink> hotDrinkList;
    private int money;

    public CupOfCoffeAutomate(List<HotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }


    @Override
    public HotDrink htDrink(String name, int volume) {
        for (HotDrink drink : hotDrinkList) {
            if (drink.getName().equals(name) && drink.getVolume() == volume) {
                money += drink.getCost();
                return drink;
            }
        }
        return null;
    }
}
