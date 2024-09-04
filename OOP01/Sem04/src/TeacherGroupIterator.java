import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private int count;
    private List<Teacher> teacherList;

    public TeacherGroupIterator(TeacherGroup teacherGroup) {
        this.count = 0;
        this.teacherList = teacherGroup.getTeacherList();
    }

    @Override
    public boolean hasNext() {
        return count < teacherList.size() - 1;
    }

    @Override
    public Teacher next() {
        if(!hasNext()) {
            return null;
        }
        count++;
        return teacherList.get(count);
    }
}
