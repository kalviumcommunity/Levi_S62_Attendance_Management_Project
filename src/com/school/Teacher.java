package com.school;

public class Teacher extends Person {
    private String subjectTaught;
    Teacher(String Name,String subjectTaught) {
        super(Name);
        this.subjectTaught = subjectTaught;
    }
    @Override
    public void displayRecord() {
        super.displayRecord();
        System.out.println("Subject Taught: " + subjectTaught);
        System.out.println("Role: Teacher");
    } 
}