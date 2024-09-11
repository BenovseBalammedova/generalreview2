package serviceImpl;

import entity.Teacher;
import exception.TeacherIllegalArgumentException;
import exception.TeacherNotFoundException;
import model.Position;
import service.CommonService;
import service.TeacherService;
import util.FileWrite;

import java.util.ArrayList;
import java.util.List;

public class TeacherServiceImpl implements CommonService<Teacher>, TeacherService {
    static List<Teacher>teacherList=new ArrayList<>();
    static {
        teacherList.add(new Teacher("Samir", "Məmmədov", 201, 40, "samir@gmail.com", Position.TEACHER, "Mathematics", 2000, "Science", "B203"));
        teacherList.add(new Teacher("Leyla", "Qurbanova", 202, 35, "leyla@gmail.com", Position.DEKAN, "Physics", 1800, "Science", "C102"));
        teacherList.add(new Teacher("Nigar", "Əliyeva", 203, 45, "nigar@gmail.com", Position.MANAGER, "History", 2100, "Humanities", "A305"));

    }
    @Override
    public void add(Teacher object) {
        try {
            teacherList.add(object);
        }
        catch (TeacherIllegalArgumentException ex){
          throw  new TeacherIllegalArgumentException("illegal arqument daxil etdiniz");
        }
        finally {
            System.out.println("");
        }

    }

    @Override
    public void update(int id, String name) {
        try{
            Teacher teacher=teacherList.get(id-1);
            teacher.setName(name);
            teacherList.add(teacher);
        }
        catch (TeacherNotFoundException ex){
            throw new TeacherNotFoundException("bele bir teacher yoxdur");
        }
        System.out.println("");

    }

    @Override
    public Teacher getById(int id) {
        try {
            return teacherList.get(id-1);
        }
        catch (TeacherNotFoundException ex){
            throw new TeacherNotFoundException("Muelim bazada yoxdur");
        }
        finally {
            System.out.println("");
        }

    }

    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }

    @Override
    public void delete(int id) {
        try {

            Teacher teacher = teacherList.remove(id - 1);
            String teachers = teacher.getName() + teacher.getSalary() + teacher.getDepartment();
            FileWrite.writefile("text.file", teachers);
        }
        catch (TeacherNotFoundException ex){
            throw new TeacherNotFoundException("bele bir teacher yoxdur");
        }
        finally {
            System.out.println("");
        }
    }

    @Override
    public List<Teacher> getAllName( String name) {
        return teacherList.stream().filter(teacher -> teacher.getName().equals(name)).toList();
    }

    @Override
    public List<Teacher> getAllSalary(int Salary) {
        return teacherList.stream().filter(teacher -> teacher.getSalary()==Salary).toList();
    }

    @Override
    public void UpdateSubjectAndSalary(int id, String subject, int Salary) {
     Teacher teacher=teacherList.get(id-1);
     teacher.setSubject(subject);
     teacher.setSalary(Salary);
     teacherList.add(teacher);
    }

    @Override
    public void UpdateNameAndAge(int id, String name, int age) {
        Teacher teacher=teacherList.get(id-1);
        teacher.setName(name);
        teacher.setAge(age);
        teacherList.add(teacher);
    }
}
