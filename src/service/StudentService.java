package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    List<Student>getAllName(String name);
    List<Student>getAllMajor(String Major);
    void UpdateGpaAndMajor(int id,double Gpa,String major);
    void UpdateNameAndAge(int id,String name,int age);
}
