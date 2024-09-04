import java.util.Iterator;
import java.util.Scanner;

public class TeacherGroupService {

    private TeacherGroup teacherGroup;

    public void editTeacherByFIO(String firstName, String lastName, String middleName) throws Exception {
        Iterator<Teacher> iter = teacherGroup.iterator();
        Scanner input = new Scanner(System.in);
        int choise = 0;
        String tempFIO = null;
        while (iter.hasNext()) {
            Teacher teacher = iter.next();
            if ( (teacher.getFirstName().equals(firstName)) && (teacher.getLastName().equals(lastName)) && (teacher.getMiddleName().equals(middleName)) ) {
                System.out.println("Укажите позицию редактирования: 1 - Имя, 2 - Фамилия, 3 - Отчество. Ожидание выбора... ");
                choise = input.nextInt();
                switch (choise) {
                    case 1:
                        System.out.println("Введите новое имя: ");
                        tempFIO = input.nextLine();
                        teacher.setFirstName(tempFIO);
                        break;
                    case 2:
                        System.out.println("Введите новую фамилию: ");
                        tempFIO = input.nextLine();
                        teacher.setLastName(tempFIO);
                        break;
                    case 3:
                        System.out.println("Укажите новое отчество: ");
                        tempFIO = input.nextLine();
                        teacher.setMiddleName(tempFIO);
                        break;
                    default:
                        //System.out.println("Нет данных для изменения");
                        throw new Exception("Указан неверный код выбора!");
                }
            }
        }
        input.close();
    }

    public void createTeacher(String firstName, String lastName, String middleName) {
        teacherGroup.createTeacher(firstName, lastName, middleName);
    }

}
