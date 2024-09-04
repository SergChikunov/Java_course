import java.util.List;

public class StudentController implements UserController<Student> {

    private StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> sortStudentByID () {
        List<Student> studentList = studentGroupService.sortStudentByID();
        studentView.sendInConsole(studentList);
        return studentList;
    }
    public List<Student> sortStudentByFIO () {
        List<Student> studentList =studentGroupService.sortStudentByFIO();
        studentView.sendInConsole(studentList);
        return studentList;
    }

    @Override
    public void creates(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
