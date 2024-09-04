import java.util.List;

public class TeacherView implements UserView<Teacher> {


    @Override
    public void sendInConsole(List<Teacher> list) {
        for (Teacher personTeach : list) {
            System.out.println(personTeach.getTeacherId());
        }
    }
}
