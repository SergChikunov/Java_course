/*
 *  Обработка нескольких исключений
 * В Java имеется множество различных типов исключений, и мы можем разграничить их обработку, включив дополнительные блоки catch
 * 
 */
public class L1task18 {
    public static void main(String[] args) {
        int[] numbers = new int[3];  // массив с тремя элементами, след. max index = 2
        try {
            // numbers[6] = 45;  // осознанно обращаемся к элементу с индексом за границей массива
            numbers[6] = Integer.parseInt("gfd");  // здесь пытаемся превратить строку в число
        } catch (ArrayIndexOutOfBoundsException ex) {  // обработка исключения выхода за пределы массива

            System.out.println("Выход за пределы массива");
        } catch (NumberFormatException ex) {  // обработка исключения об ошибке преобразования строки в число

            System.out.println("Ошибка преобразования из строки в число");
        }
        System.out.println("Будет обработано первое попавшееся исключение и код выполняется далее");
    }

}
