package entity;

import model.Position;

public class Person {
    private String name;
    private String surname;
    private  int id;
    private  int age;
    private String email;
    private Position position;

    public Person() {
    }

    public Person(String name, String surname, int id, int age, String email, Position position) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.age = age;
        this.email = email;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", position=" + position +
                '}';
    }
}
