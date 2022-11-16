package peaksoft.course;

import peaksoft.person.Mentor;
import peaksoft.person.Student;

import java.time.LocalDate;


public class Group {
    private String name;
    private Student[] students;
    private LocalDate dateOfStart;
    private LocalDate dateOfFinish;

    public Group(String name, Student[] students, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.name = name;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }
    public Group(String name, Mentor[] mentors, LocalDate dateOfStart, LocalDate dateOfFinish) {
        this.name = name;
        this.students = students;
        this.dateOfStart = dateOfStart;
        this.dateOfFinish = dateOfFinish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfFinish() {
        return dateOfFinish;
    }

    public void setDateOfFinish(LocalDate dateOfFinish) {
        this.dateOfFinish = dateOfFinish;
    }
}
