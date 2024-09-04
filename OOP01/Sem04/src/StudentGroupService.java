import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public void removeStudentByFIO (String firstName, String lastName, String middleName) {

        Iterator<Student> iter = studentGroup.iterator();
        while (iter.hasNext()) {
            Student student = iter.next();
            if ( (student.getFirstName().equals(firstName)) && (student.getLastName().equals(lastName)) && (student.getMiddleName().equals(middleName)) ) {
                iter.remove();
            }
        }
    }

    public List<Student> sortStudentByID () {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(studentList);
        return studentList;
    }

    public List<Student> sortStudentByFIO () {
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());
        studentList.sort(new UserComparator<Student>());
        return studentList;

    }

    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createStudent(firstName, lastName, middleName);
    }

}
