package org.generation.poo;

import org.generation.Curses.Curses;
import org.generation.Courses.StudentP;

public class Main {
    public static void main(String[] args) {
        StudentP student1 = new StudentP("Emilio", "Castellanos", 1, 43, 2);
        StudentP student2 = new StudentP("Jesualy", "Peña", 2, 80, 1);
        StudentP student3 = new StudentP("Carolina", "Hérnandez", 3, 68, 3);

        Curses course = new Curses("Mathematics", "Inge.Elizabeth", 2024);

        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);

        System.out.println("Total students: " + course.countStudents());
        System.out.println("Best grade: " + course.bestGrade());

        StudentP[] newStudents = {
            new StudentP("Lolita", "López", 4, 90, 1),
            new StudentP("Estrella", "Urritia", 5, 70, 2)
        };

        course.enroll(newStudents);
        System.out.println("Total students after enrolling new students: " + course.countStudents());
    }
}
