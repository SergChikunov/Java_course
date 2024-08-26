import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HotDrink> myCupCoffee = new ArrayList<>();
        myCupCoffee.add(new HotDrinkWithTemp("Coffe50", 45, 150, 50));
        myCupCoffee.add(new HotDrinkWithTemp("Coffe45", 45, 150, 45));
        myCupCoffee.add(new HotDrinkWithTemp("Coffe55", 45, 150, 55));
        myCupCoffee.add(new HotDrinkWithTemp("Coffe60", 45, 150, 60));


        CupOfCoffeAutomate cupCoffee = new CupOfCoffeAutomate(myCupCoffee);
        System.out.println(new CupOfCoffe("Coffe50", 45, 150));
        System.out.println(new CupOfCoffe("Coffe45", 45, 120));
        System.out.println(new CupOfCoffe("Coffe60", 45, 150));

        System.out.println(new HotDrinkWithTemp("Coffe50", 45, 150, 50));
        System.out.println(new HotDrinkWithTemp("Coffe45", 45, 150, 45));
        System.out.println(new HotDrinkWithTemp("Coffe55", 45, 150, 55));
        System.out.println(new HotDrinkWithTemp("Coffe60", 45, 150, 60));

    }
}