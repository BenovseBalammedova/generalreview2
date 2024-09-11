package entity;

import model.Position;

public class Student extends  Person {
    private int grade;
    private String major;
    private double GPA;
    private String advisorName;

    public Student() {
    }

    public Student(String name, String surname, int id, int age, String email, Position position, int grade, String major, double GPA, String advisorName) {
        super(name, surname, id, age, email, position);
        this.grade = grade;
        this.major = major;
        this.GPA = GPA;
        this.advisorName = advisorName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", major='" + major + '\'' +
                ", GPA=" + GPA +
                ", advisorName='" + advisorName + '\'' +
                "} " + super.toString();
    }
}
