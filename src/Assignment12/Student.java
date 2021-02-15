package Assignment12;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String engDepartment;
    int yearOfEnrollment;
    double percentageTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment, double percentageTillDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.percentageTillDate = percentageTillDate;
    }

    @Override
    public String toString() {
        return "[" + id + " , " + name + " , " + age + " , " + gender + " , " + engDepartment + " , " + yearOfEnrollment + " , " + percentageTillDate + "]";
    }
}
