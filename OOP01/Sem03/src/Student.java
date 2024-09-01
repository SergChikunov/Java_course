public class Student implements Comparable<Student> {

    private Long StudentID;
    private String firstName;
    private String lastName;
    private String middletName;

    public Long getStudentID() {
        return StudentID;
    }

    public void setStudentID(Long studentID) {
        StudentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddletName() {
        return middletName;
    }

    public void setMiddletName(String middletName) {
        this.middletName = middletName;
    }

    @Override
    public String toString() {
        return "Студент - {" +
                "Идентификатор = " + StudentID +
                ", Имя = '" + firstName + '\'' +
                ", Фамилия = '" + lastName + '\'' +
                ", Отчество = '" + middletName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
//        if (this.StudentID > obj.getStudentID()) return -1;
//        else if (this.StudentID < obj.getStudentID()) return 1;
//
//        return 0;
        return this.StudentID.compareTo(obj.StudentID);
    }
}
