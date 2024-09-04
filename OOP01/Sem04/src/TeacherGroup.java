import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher> {

    private List<Teacher> teacherList;

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }

    @Override
    public String toString() {
        StringBuilder listTeachers = new StringBuilder();
        for (Teacher teacher : teacherList) {
            listTeachers.append("Имя: ");
            listTeachers.append(teacher.getFirstName());
            listTeachers.append(", Фамилия: ");
            listTeachers.append(teacher.getLastName());
            listTeachers.append(", Отчество: ");
            listTeachers.append(teacher.getMiddleName());
            listTeachers.append("\n");
        }
        return listTeachers.toString();
    }
}
