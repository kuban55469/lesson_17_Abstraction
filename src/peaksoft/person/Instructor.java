package peaksoft.person;

import peaksoft.course.Group;

import java.time.LocalDate;

public class Instructor extends Person{
    private double salary;

    public Instructor(Long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double period(Group group) {
        LocalDate localDate = LocalDate.now();
        LocalDate result = group.getDateOfFinish().minusYears(group.getDateOfStart().getYear()).minusMonths(group.getDateOfStart()
                .getMonthValue()).minusDays(group.getDateOfStart().getDayOfMonth());
        return result.getMonthValue();
    }

    @Override
    public void sortAge(Student[] students, Instructor[] instructors, Mentor[] mentors) {

    }


}
