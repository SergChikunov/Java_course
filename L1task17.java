/*
 * Обработка исключений
 */
public class L1task17 {
    public static void main(String[] args) {
        try {  // в последовательности обработки исключений сначала обрабатывается блок try, если все проходит успешно, то выполняется блок finally (этот блок необязательный)
            int[] numbers = new int[3];  // массив из трех элементов, след. последний index = 2
            numbers[4] = 45;  // обратимся к элементу с index = 4, тем самым исскустввенно создадим исключение, в этом случае отрабатывает блок catch
            System.out.println(numbers[4]);
        } catch (Exception ex) {  // при возникновении исключения управление передается этому блоку, запомнить - исключение необходимо обработать ПРАВИЛЬНО!!!
                                // после обработки исключения код продолжит выполнение, при условии что исключение обработано верным подходом
            ex.printStackTrace();
        } finally {     // этот блок необязательный, он выполнится в любом случае
            System.out.println("Блок finally");
        }
        System.out.println("Программа завершена");
    }

}
