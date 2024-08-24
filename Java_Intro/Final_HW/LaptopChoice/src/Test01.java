import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("Gray");
        testList.add("Black");
        testList.add("Silver");
        testList.add("Red");
        testList.add("Yellow");
        testList.add("Purple");

        System.out.println("Под индексом 0 в списке значится " + testList.get(0));
        System.out.println("Под индексом 1 в списке значится " + testList.get(1));
        System.out.println("Под индексом 2 в списке значится " + testList.get(2));

        Map<String, Integer> setColor = new HashMap<>();

        for (int i = 0; i < testList.size(); i++) {
            System.out.println("Под индексом " + i + " в списке значится элемент " + testList.get(i));
        }

        for (int i = 0; i < testList.size(); i++) {
            System.out.println(i + " ---> " + testList.get(i));
        }

        setColor.put(testList.get(0), 0);
        setColor.put(testList.get(2), 2);
        setColor.put(testList.get(5), 5);

        System.out.println(setColor);
    }
}
