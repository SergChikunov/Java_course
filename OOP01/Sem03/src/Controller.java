import java.util.List;

public class Controller {

    private StudentGroupService studentGroupService = new StudentGroupService();
    private StreamService streamService = new StreamService();

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }
    public List<Student> sortStudentByID () {
        return studentGroupService.sortStudentByID();
    }
    public List<Student> sortStudentByFIO () {
        return studentGroupService.sortStudentByFIO();
    }

    public List<Stream> sortStreamByName () {
        return streamService.sortStreamByName();
    }
}
