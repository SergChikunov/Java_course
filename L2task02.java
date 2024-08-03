/*
 * Продолжение работы со строками
 */
public class L2task02 {
    public static void main(String[] args) {
        String[] name = {"С", "е", "р", "г", "е", "й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase());  // в нижний регистр
        System.out.println(String.join("", name));  // имспользование метода join()
        System.out.println(String.join("", "С", "е", "р", "г", "е", "й"));
        System.out.println(String.join(",", "С", "е", "р", "г", "е", "й"));
    }

}
