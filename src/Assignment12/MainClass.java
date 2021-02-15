package Assignment12;

public class MainClass {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.addStudentsIntoList();
        System.out.println("Total Students: " + studentList.students.size());

        StreamOperationsOnStudents streamObject = new StreamOperationsOnStudents();
        streamObject.getAllDepartments(studentList.students);
        streamObject.getNamesOfAllStudentsEnrolledAfter_Year(studentList.students, 2018);
        streamObject.getDetailsOfStudents_Gender_Department(studentList.students, "Male", "Computer Science");
        streamObject.getCountOfStudentsByGender(studentList.students);
        streamObject.getAverageAgeByGender(studentList.students);
        streamObject.getDetailsOfTopStudent(studentList.students);
        streamObject.getCountOfStudentsByDepartment(studentList.students);
        streamObject.getAveragePercentageByDepartment(studentList.students);
        streamObject.getDetailsOfYoungestStudent_Gender_Department(studentList.students, "Male", "Electronic");
        streamObject.getCountOfStudentsByGenderInDept(studentList.students, "Computer Science");
    }

}
