public class TeacherController implements UserController<Teacher> {

    private TeacherGroupService teacherGroupService = new TeacherGroupService();
    private final TeacherView teacherView = new TeacherView();

    public void editTeacherByFIO(String firstName, String lastName, String middleName) throws Exception {
        teacherGroupService.editTeacherByFIO(firstName, lastName, middleName);
    }

        @Override
    public void creates(String firstName, String lastName, String middleName) {
        teacherGroupService.createTeacher(firstName, lastName, middleName);
    }
}
