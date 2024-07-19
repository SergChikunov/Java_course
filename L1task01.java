public class L1task01 {
    public static void main(String[] args) throws Exception {
        int a = 13;  // целочисленный тип данных
        double d = a;  // тип данных с плавающей запятой двойной точности, в него можно без проблем записать int (неявное преобразование типа), наоборот нельзя!!!
        System.out.println(a);
        System.out.println(d);
        float e = 2.71f;  // тип данных с плавающей запятой, завершающая f обязательна при объявлении типа!!!
        System.out.println(e);
        char ch = '1';  // символьный тип данных
        System.out.println(Character.isDigit(ch)); // проверка является ли символ цифрой, класс-обертка Character
        char ch1 = 'a';
        System.out.println(Character.isDigit(ch1)); // False
        boolean flag1 = 123 <= 234;  // тип данных boolean
        System.out.println(flag1);
        boolean flag2 = 123 >= 234 || flag1; // or
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2; // xor
        System.out.println(flag3);
    }
}