import java.util.ArrayList;
import java.util.List;

public class Sem03_Task01 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student persOne = new Student();
        Student persTwo = new Student();
        Student persThree = new Student();
        Student persFour = new Student();
        students.add(persOne);
        students.add(persTwo);
        students.add(persThree);
        students.add((persFour));
        System.out.println("\nСписок студентов:\n" + students);
    }
}
