/*
 *  Метод с несколькими return и структурированным оператором ветвления
 */
public class L1task15 {
    static String daytime(int hour) {

        if (hour > 24 || hour < 0)
            return "Invalid data";
        else if (hour > 21 || hour < 6)
            return "Good night";
        else if (hour >= 15)
            return "Good evening";
        else if (hour >= 11)
            return "Good after noon";
        else
            return "Good morning";
    }

    public static void main(String[] args) {
        System.out.println(daytime(7)); // Good morning
        System.out.println(daytime(13)); // Good after noon
        System.out.println(daytime(18)); // Good evening
        System.out.println(daytime(2)); // Good night
    }

}
