package serviceImpl;

import entity.Student;
import exception.StudentIllegalArgumentException;
import exception.StudentNotFoundException;
import exception.TeacherNotFoundException;
import model.Position;
import service.CommonService;
import service.StudentService;
import util.FileWrite;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements CommonService<Student> , StudentService {
    static List<Student>studentList=new ArrayList<>();
    static {
        studentList.add(new Student("Elvin", "Hüseynov", 101, 20, "elvin@gmail.com", Position.STUDENT, 3, "Computer Science", 3.8, "Dr. Məmmədov"));
        studentList.add(new Student("Aytən", "Quliyeva", 102, 22, "ayten@gmail.com", Position.STUDENT, 4, "Mathematics", 3.9, "Dr. Əliyeva"));
        studentList.add(new Student("Rəşad", "Qurbanov", 103, 19, "resad@gmail.com", Position.STUDENT, 2, "Physics", 3.6, "Dr. İsmayılov"));

    }
    @Override
    public void add(Student object) {
        try {
           studentList.add(object);

        }
        catch (StudentIllegalArgumentException ex){

            throw new StudentIllegalArgumentException("siz olmayan bir argument daxil etdiniz");


        }
        finally {
            System.out.println(" ");
        }
    }

    @Override
    public void update(int id, String name) {

     Student student=studentList.get(id-1);
     student.setName(name);
     studentList.add(student);
    }

    @Override
    public Student getById(int id) {
        try {
            return studentList.get(id - 1);
        } catch (StudentNotFoundException ex) {

            throw new StudentNotFoundException("Telebe bazada yoxdur: " + id);
        }
        finally {
            System.out.println("");
        }




    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }

    @Override
    public void delete(int id) {

     Student student= studentList.remove(id-1);
     String deleteUser=student.getName()+student.getMajor()+student.getSurname();
        FileWrite.writefile("text.file",deleteUser);
    }

    @Override
    public List<Student> getAllName(String name) {

        return studentList.stream().filter(student -> student.getName().equals(name)).toList();
    }

    @Override
    public List<Student> getAllMajor( String Major) {
        return studentList.stream().filter(student -> student.getMajor().equals(Major)).toList();
    }

    @Override
    public void UpdateGpaAndMajor(int id, double Gpa, String major) {
      Student student=studentList.get(id-1);
      student.setGPA(Gpa);
      student.setMajor(major);
      studentList.add(student);
    }

    @Override
    public void UpdateNameAndAge(int id, String name, int age) {
        Student student=studentList.get(id-1);
        student.setName(name);
        student.setAge(age);
        studentList.add(student);
    }
}
