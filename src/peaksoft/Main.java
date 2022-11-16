package peaksoft;

import peaksoft.company.Company;
import peaksoft.company.ItAcademy;
import peaksoft.company.PeaksoftHouse;
import peaksoft.course.Course;
import peaksoft.course.Group;
import peaksoft.person.Instructor;
import peaksoft.person.Mentor;
import peaksoft.person.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        /*
        Company{
* String name;
* String address;
* Course[]courses;
* String languageOfInstruction;
* } деген класс тузунуз
                * 2.Company классын мурастаган 2 класс тузунуз алар:
* PeaksoftHouse, ItAcademy.
                * Course деген класс тузунуз(String programming  ,Group []groups ,
* Instructor instructor,Mentor[] mentors )
* Group деген класс тузунуз(Group name,Students[]students,LocalDate dateOfStart,LocalDate dateOfFinish)
* Person деген абстрактный класс тузунуз(Long id,String fullName,int age, char gender).
* Person классын мурастаган Instructor(double salary),Student (double contract )тузунуз.
                * Instructor классыны мурастаган Mentor деген класс тузунуз.
* ~~~~~~~~~~~~~~~Methods~~~~~~~~~~
                * 1-Company классынын ичинде статичный  double income(Student[]students)деген метод  тузунуз,
* ал метод бардык студенттердин контрагынын  суммасын кайтарсын.
                * 2-Person классынын ичинде abstract double period(Group group) бул методду Student,
* Instructor жана Mentor классы реализация кылсын.Жалпы окутуу убактысына Instructor ,
* Mentor канча зарплата алат,Student канча контракт толоосун ошону кайтарсын.
 3-Person классынын ичине sortAge()деген метод тузунуз ал бизге
 * Instructor Student жана Ментордун жашын сорттоп берсин.
                */

        Student studentJava = new Student(10L, "Kuban Kelsinbekov", 20, 'M', 12000);
        Student[] studentsJava = {studentJava};

        Student studentJS = new Student(12L, "Kurmanbek Tashtemirov", 16, 'M', 9000);
        Student[] studentsJS = {studentJS};


        Student studentJavaIt = new Student(101L, "Tashtan Kelenbekov", 28, 'M', 11000);
        Student[] studentsJavaIt = {studentJavaIt};

        Student studentJSIt = new Student(121L, "Amantur Kochkorov", 26, 'M', 8000);
        Student[] studentsJSIt = {studentJSIt};

        Instructor instructorJS = new Instructor(123L, "Jumabek Zalkarbekov ", 22, 'M', 40000);
        Instructor instructorJava = new Instructor(124L, "Aijamal Asangazieva", 25, 'W', 30000);

        Instructor instructorItJS = new Instructor(1230L, "Jumabek Zalkarbekov ", 32, 'M', 250000);
        Instructor instructorItJava = new Instructor(1240L, "Aijamal Asangazieva", 45, 'W', 20000);


        Mentor mentorJava = new Mentor(21L, "Rahim Bazarbai uulu", 19, 'M', 25000);
        Mentor[] mentorsJava = {mentorJava};

        Mentor mentorJS = new Mentor(30L, "Azamat Abdykaparov", 24, 'M', 20000);
        Mentor[] mentorsJS = {mentorJS};

        Mentor mentorItJava = new Mentor(211L, "Shami Bazarbaev", 39, 'M', 30000);
        Mentor[] mentorsItJava = {mentorItJava};

        Mentor mentorItJS = new Mentor(30L, "Abdykapar Samatov", 44, 'M', 25000);
        Mentor[] mentorsItJS = {mentorItJS};


        Group groupJava = new Group("Java-8", studentsJava, LocalDate.of(2022, 10, 1), LocalDate.of(2023, 7, 30));
        Group groupJS = new Group("JS-8", studentsJS, LocalDate.of(2022, 10, 1), LocalDate.of(2023, 7, 30));
        Group[] groupsJava = {groupJava};
        Group[] groupsJS = {groupJS};

        Group groupJavaIt = new Group("Java-8", studentsJavaIt, LocalDate.of(2022, 10, 1), LocalDate.of(2023, 7, 31));
        Group groupJSIt = new Group("JS-8", studentsJSIt, LocalDate.of(2022, 10, 1), LocalDate.of(2023, 7, 30));
        Group[] groupsJavaIt = {groupJavaIt};
        Group[] groupsJSIt = {groupJSIt};


        Course[] coursesPH = {
                new Course("backend", groupsJava, instructorJava, mentorsJava),
                new Course("frontend", groupsJS, instructorJS, mentorsJS)
        };

        Course[] coursesIA = {
                new Course("backend", groupsJavaIt, instructorItJava, mentorsItJava),
                new Course("frontend", groupsJSIt, instructorItJS, mentorsItJS)
        };

        PeaksoftHouse peaksoftHouse = new PeaksoftHouse("Esen Niazov", "Bishkek", coursesPH, "Kyrgyz");
        ItAcademy itAcademy = new ItAcademy("Emir Niazov", "Bishkek", coursesIA, "Russian");

        Student[] students = {studentJava, studentJS, studentJavaIt, studentJSIt};
        Instructor[] instructors = {instructorJava, instructorJS, instructorItJava, instructorItJS};
        Mentor[] mentors = {mentorJava, mentorJS, mentorItJava, mentorItJS};


        System.out.println("Summa: " + Company.income(students) + "\n");

        System.out.println("Курс Java длится: " + studentJava.period(groupJava) + " месяцов.\nКонтракт будет " +
                studentJava.period(groupJava) * studentJava.getContract() + " сом");
        System.out.println("Курс J-S длится: " + studentJS.period(groupJava) + " месяцов.\nКонтракт будет " +
                studentJS.period(groupJava) * studentJS.getContract() + " сом\n");
        System.out.println("Курс Java в It-Academy длится: " + studentJavaIt.period(groupJava) + " месяцов.\nКонтракт будет " +
                studentJavaIt.period(groupJava) * studentJavaIt.getContract() + " сом");
        System.out.println("Курс J-S в It-Academy длится: " + studentJSIt.period(groupJava) + " месяцов.\nКонтракт будет " +
                studentJSIt.period(groupJava) * studentJSIt.getContract() + " сом\n");

        System.out.println("Зарплата Java  ментора в peaksoft: " + studentJava.period(groupJava) * mentorJava.getSalary());
        System.out.println("Зарплата J-S  ментора в peaksoft: " + studentJava.period(groupJava) * mentorJS.getSalary());
        System.out.println("Зарплата Java  ментора в It-Academy: " + studentJava.period(groupJava) * mentorItJava.getSalary());
        System.out.println("Зарплата J-S  ментора в It-Academy: " + studentJava.period(groupJava) * mentorItJS.getSalary() + "\n");

        System.out.println("Зарплата Java  инструктора в peaksoft: " + studentJava.period(groupJava) * instructorJava.getSalary());
        System.out.println("Зарплата J-S  инструктора в peaksoft: " + studentJava.period(groupJava) * instructorJS.getSalary());
        System.out.println("Зарплата Java  инструктора в It-Academy: " + studentJava.period(groupJava) * instructorItJava.getSalary());
        System.out.println("Зарплата J-S  инструктора в It-Academy: " + studentJava.period(groupJava) * instructorItJS.getSalary() + "\n");

        studentJava.sortAge(students, instructors, mentors);
    }
}
