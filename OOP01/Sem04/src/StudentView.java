import java.util.List;

public class StudentView implements UserView<Student> {


    @Override
    public void sendInConsole(List<Student> list) {
        for (Student person : list) {
            System.out.println(person.getStudentId());
        }
    }
}
