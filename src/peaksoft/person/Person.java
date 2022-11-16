package peaksoft.person;

import peaksoft.course.Group;

public abstract class Person {
    private Long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(Long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public abstract double period(Group group);
        //бул методду Student,
        // Instructor жана Mentor классы реализация кылсын.Жалпы окутуу убактысына Instructor ,
        // Mentor канча зарплата алат,Student канча контракт толоосун ошону кайтарсын.

    public abstract void  sortAge(Student[] students,Instructor[] instructors,Mentor[] mentors);


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
