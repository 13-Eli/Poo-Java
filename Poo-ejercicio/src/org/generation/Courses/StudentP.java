package org.generation.Courses;


public class StudentP{
    String firstName;
    String lastName;
    int registration;
    public int grade;
    int year;

    
    public StudentP(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    
    public StudentP(String firstName, String lastName) {
        this(firstName, lastName, 0, 0, 1); 
    }

   
    public StudentP() {
        this("anyone", "anyone", 0, 0, 1); 
    }

    public void printFullName() {
        System.out.println(this.firstName + " " + this.lastName);
    }

    public boolean isApproved() {
        return this.grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            this.year += 1;
            System.out.println("!Congrats!");
        }
        return this.year;
    }
}
