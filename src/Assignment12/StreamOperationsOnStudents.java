package Assignment12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamOperationsOnStudents {

    /**
     * 1. Print the name of all departments in the college
     *
     * @param studentsList
     */
    public void getAllDepartments(List<Student> studentsList) {
        List<String> departments = studentsList.stream().map(s -> s.engDepartment).distinct().collect(Collectors.toList());
        System.out.println("--------- 1. Names of all departments(distinct) in the college --------");
        System.out.println("No. of departments(distinct): " + departments.size());
        System.out.println(departments);
    }

    /**
     * 2. Get the names of all students who have enrolled after 2018
     *
     * @param studentsList
     * @param year
     */
    public void getNamesOfAllStudentsEnrolledAfter_Year(List<Student> studentsList, int year) {
        List<String> studentsEnrolledAfter2018 = studentsList.stream().filter(s -> s.yearOfEnrollment > year).map(s -> s.name).collect(Collectors.toList());
        System.out.println("--------- 2. Names of all students who have enrolled after " + year + " --------");
        System.out.println("No. of students who have enrolled after " + year + " : " + studentsEnrolledAfter2018.size());
        System.out.println(studentsEnrolledAfter2018);
    }

    /**
     * 3. Get the details of all male students in the computer sci department
     *
     * @param studentsList
     * @param gender
     * @param dept
     */
    public void getDetailsOfStudents_Gender_Department(List<Student> studentsList, String gender, String dept) {
        List<Student> genderDept_Students = studentsList.stream().filter(s -> s.gender.equalsIgnoreCase(gender) && s.engDepartment.equalsIgnoreCase(dept)).collect(Collectors.toList());
        System.out.println("--------- 3. Details of all " + gender + " students in the " + dept + " department ---------");
        //System.out.println("No. of male-CSE Students: " + genderDept_Students.size());
        for (Student s : genderDept_Students)
            System.out.println(s.toString());
    }

    /**
     * 4. How many male and female students are there ?
     *
     * @param studentsList
     */
    public void getCountOfStudentsByGender(List<Student> studentsList) {
        Map<String, List<Student>> genderGroupedMap = studentsList.stream().collect(Collectors.groupingBy(s -> s.gender));
        int maleStudentsCount = (int) genderGroupedMap.get("Male").stream().count();
        int femaleStudentsCount = (int) genderGroupedMap.get("Female").stream().count();
        System.out.println("--------- 4. Number of male and female students ---------");
        System.out.println("maleStudentsCount: " + maleStudentsCount);
        System.out.println("femaleStudentsCount: " + femaleStudentsCount);
    }

    /**
     * 5.What is the average age of male and female students?
     *
     * @param studentsList
     */
    public void getAverageAgeByGender(List<Student> studentsList) {
        Map<String, List<Student>> genderGroupedMap = studentsList.stream().collect(Collectors.groupingBy(s -> s.gender));
        double averageAgeOfMale = genderGroupedMap.get("Male").stream().collect(Collectors.averagingInt(s -> s.age));
        double averageAgeOfFemale = genderGroupedMap.get("Female").stream().collect(Collectors.averagingInt(s -> s.age));

        System.out.println("--------- 5. Average age of male and female students ---------");
        System.out.println("averageAgeOfMale: " + averageAgeOfMale);
        System.out.println("averageAgeOfFemale: " + averageAgeOfFemale);
    }

    /**
     * 6. Get the details of highest student having highest percentage
     *
     * @param studentsList
     */
    public void getDetailsOfTopStudent(List<Student> studentsList) {
        Student topper = studentsList.stream().max(Comparator.comparingDouble(s -> s.percentageTillDate)).get();
        System.out.println("--------- 6. Get the details of Topper (highest student having highest percentage) ---------");
        System.out.println(topper);
    }

    /**
     * 7. Count the number of students in each department? (Hint :use Collectors.groupingBy())
     *
     * @param studentsList
     */
    public void getCountOfStudentsByDepartment(List<Student> studentsList) {
        Map<String, List<Student>> departmentGroupedMap = studentsList.stream().collect(Collectors.groupingBy(s -> s.engDepartment));
        System.out.println("--------- 7. Count the number of students in each department ---------");
        for (String dept : departmentGroupedMap.keySet()) {
            System.out.println("Number of students in department '" + dept + "' are: " + departmentGroupedMap.get(dept).size());
        }
    }

    /**
     * 8. What is the average percentage achieved in each department?
     *
     * @param studentsList
     */
    public void getAveragePercentageByDepartment(List<Student> studentsList) {
        Map<String, List<Student>> departmentGroupedMap = studentsList.stream().collect(Collectors.groupingBy(s -> s.engDepartment));
        System.out.println("--------- 8. Average percentage achieved in each department ---------");
        for (String dept : departmentGroupedMap.keySet()) {
            System.out.println("Average percentage in department '" + dept + "' is: " + departmentGroupedMap.get(dept).stream().collect(Collectors.averagingDouble(s -> s.percentageTillDate)));
        }
    }

    /**
     * 9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
     *
     * @param studentsList
     * @param gender
     * @param dept
     */
    public void getDetailsOfYoungestStudent_Gender_Department(List<Student> studentsList, String gender, String dept) {
        List<Student> genderDept_Students = studentsList.stream().filter(s -> s.gender.equalsIgnoreCase(gender) && s.engDepartment.equalsIgnoreCase(dept)).collect(Collectors.toList());
        System.out.println("--------- 9. Details of youngest " + gender + " student in the " + dept + " department ---------");
        Student youngestMaleStudentInElectronic = genderDept_Students.stream().collect(Collectors.minBy(Comparator.comparingInt(s -> s.age))).get();
        System.out.println(youngestMaleStudentInElectronic.toString());
    }

    /**
     * 10. Number of male and female students in dept(Computer Science) department
     *
     * @param studentsList
     * @param dept
     */
    public void getCountOfStudentsByGenderInDept(List<Student> studentsList, String dept) {
        Map<String, List<Student>> deptFilteredGenderGroupedMap = studentsList.stream().filter(s -> s.engDepartment.equals(dept)).collect(Collectors.groupingBy(s -> s.gender));
        int maleStudentsCountInDept = deptFilteredGenderGroupedMap.get("Male").size();
        int femaleStudentsCountInDept = deptFilteredGenderGroupedMap.get("Female").size();
        System.out.println("--------- 10. Number of male and female students in '" + dept + "' department ---------");
        System.out.println("maleStudentsCountInDept: " + maleStudentsCountInDept);
        System.out.println("femaleStudentsCountInDept: " + femaleStudentsCountInDept);

    }
}
