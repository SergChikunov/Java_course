public class L1task03 {
    public static void main(String[] args) {
        int maxVal = 0;
        int minVal = 0;
        maxVal = Integer.MAX_VALUE; //классы обертки
        minVal = Integer.MIN_VALUE;
        System.out.println("Maximum value: ");
        System.out.println(maxVal);
        System.out.println("Минимальное значение: ");
        System.out.println(minVal);
        int count = 12_783_986; // запись больших чисел
        System.out.println(count);
        String str = "SimpleString";
        int strLen = str.length();
        char chInd = str.charAt(6);
        System.out.println(strLen);
        System.out.println(chInd);
        // постфикстный оператор
        int a  = 123;
        System.out.println(a); // 123
        System.out.println(a++); // постфиксный оператор и результат будет снова 123, потому что приоритет этого оператора ниже чем приоритет вывода в консоль!!!
        System.out.println(a);  // а вот теперь уже вывод будет 124!!!
        System.out.println(++a); // и наоборот префиксный оператор и результат уже 125, потому что приоритет этого оператора выше чем приоритет вывода в консоль!!!
        boolean f = 123 != 234;
        System.out.println(f);
        int num = 8;
        System.out.println(num << 1);
        int num02 = 18;
        System.out.println(num02 >> 1);
        int num03 = 5;
        int num04 = 2;
        System.out.println(num03 | num04);
        // посчитать выполняя побитовые операции
        // 5 = 101
        // 2 = 010 - добавляем ведущий 0 и над каждым битом производим операцию ИЛИ согласно таблице истинности
        //     111 = 7, запускаем и проверяем, результат верен!
    }
}
