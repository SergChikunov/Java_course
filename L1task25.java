
/*
 * можно использовать еще один способ, который автоматически вызывает метод close. 
 * Этот способ заключается в использовании конструкции try-with-resources (try-с-ресурсами). 
 * Данная конструкция работает с объектами, которые реализуют интерфейс AutoCloseable. 
 * Так как все классы потоков реализуют интерфейс Closeable, который в свою очередь 
 * наследуется от AutoCloseable, то их также можно использовать в данной конструкции
 * Синтаксис конструкции следующий: try(название_класса имя_переменной = конструктор_класса). 
 * Данная конструкция также не исключает использования блоков catch.
 * После окончания работы в блоке try у ресурса (в данном случае у объекта FileInputStream) 
 * автоматически вызывается метод close().
 * Если нам надо использовать несколько потоков, которые после выполнения надо закрыть, 
 * то мы можем указать объекты потоков через точку с запятой:
 * try(FileInputStream fin=new FileInputStream("C://SomeDir//Hello.txt"); FileOutputStream fos = new FileOutputStream("C://SomeDir//Hello2.txt"))
 * Итак, перепишем предыдущий пример с использованием конструкции try-with-resources:
 */
import java.io.FileInputStream;
import java.io.IOException;

public class L1task25 {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("notes.txt")) {
            int i = -1;
            while ((i = fin.read()) != -1) {

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

}
