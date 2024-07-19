public class L1task02 {
    public static void main(String[] args) {
        var a = 123;  // неявное объявление переменной
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a));  // получение типа переменной, функция написана ниже блока main
        System.out.println(getType(d));
        d = 1022;
        System.out.println(d);
    }

    static String getType(Object o){  // принцип объявления функции в Java
        return o.getClass().getSimpleName();
        }
}
