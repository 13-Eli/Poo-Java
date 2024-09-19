package org.generation.Curses;

import java.util.ArrayList;
import java.util.List;

import org.generation.Courses.StudentP;

public class Curses {
    String courseName;
    String professorName;
    int year;
    
    List<StudentP> students;
    public void enroll(StudentP[] studentsArray) {
        for (StudentP student : studentsArray) {
            enroll(student);
        }
    }
    public Curses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.students = new ArrayList<>();
    }

    public void enroll(StudentP student) {
        students.add(student);
    }

    public void unEnroll(StudentP student) {
        students.remove(student);
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        int best = 0;
        for (StudentP student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }
    
}

