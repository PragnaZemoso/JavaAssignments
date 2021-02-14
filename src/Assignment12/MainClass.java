package Assignment12;

public class MainClass {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudentsIntoList();
        System.out.println(studentList.students.size());
    }

}
