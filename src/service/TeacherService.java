package service;

import entity.Student;
import entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllName( String name);
    List<Teacher>getAllSalary(int Salary);
    void UpdateSubjectAndSalary(int id,String subject,int Salary);
    void UpdateNameAndAge(int id,String name,int age);
}
