
/*
 * При завершении работы с потоком его надо закрыть с помощью метода close(), 
 * который определен в интерфейсе Closeable. Метод close имеет следующее определение:
 * void close() throws IOException
 * Этот интерфейс уже реализуется в классах InputStream и OutputStream, а через них и во всех классах потоков.
 * При закрытии потока освобождаются все выделенные для него ресурсы, например, файл. В случае, если поток 
 * окажется не закрыт, может происходить утечка памяти.
 * Есть два способа закрытия файла. Первый традиционный заключается в использовании блока try..catch..finally. 
 * Например, считаем данные из файла
 */
import java.io.FileInputStream;
import java.io.IOException;

public class L1task24 {
    public static void main(String[] args) {
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("notes.txt"); // код считывания помещаем в блок try, на случай возникновения
                                                      // ошибки

            int i = -1;
            while ((i = fin.read()) != -1) { // читаем файл

                System.out.print((char) i);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally { // в этот блок помещаем еще одну конструкцию try...catch, которая отработает
                    // закрытие файла в случае возникновения ошибки

            try {

                if (fin != null)
                    fin.close();
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }

}
