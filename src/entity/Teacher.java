package entity;

import model.Position;

public class Teacher extends Person {
    private String subject;
    private int salary;
    private String department;
    private String officeNumber;

    public Teacher() {
    }

    public Teacher(String name, String surname, int id, int age, String email, Position position, String subject, int salary, String department, String officeNumber) {
        super(name, surname, id, age, email, position);
        this.subject = subject;
        this.salary = salary;
        this.department = department;
        this.officeNumber = officeNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", officeNumber='" + officeNumber + '\'' +
                "} " + super.toString();
    }
}
