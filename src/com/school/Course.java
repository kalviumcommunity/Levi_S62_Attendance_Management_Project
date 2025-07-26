package com.school;

public class Course {
    int courseId; // e.g., "CS101"
    private static int nextCourseIdCounter = 1;
    String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    }

    public void displayDetails() {
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }
}