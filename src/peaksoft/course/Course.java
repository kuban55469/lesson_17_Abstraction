package peaksoft.course;

import peaksoft.person.Instructor;
import peaksoft.person.Mentor;

import javax.swing.*;

public class Course {
    private String programming;
    private Group[] group;
    private Instructor instructor;
    private Mentor[] mentors;

    public Course(String programming, Group[] group, Instructor instructor, Mentor[] mentors) {
        this.programming = programming;
        this.group = group;
        this.instructor = instructor;
        this.mentors = mentors;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public Group[] getGroup() {
        return group;
    }

    public void setGroups(Group[] group) {
        this.group = group;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }
}
