package com.exercises.week6;

public class Course {

    private String courseName;
    private Student[] students = new Student[30];
    private Teacher teacher;
    private int studentCount = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student s1) {
        students[studentCount++] = s1;
    }

    public void setTeacher(Teacher t1) {
        this.teacher = t1;
    }

    public void printStudents() {
        System.out.println("---------- Student List ----------");

        for(int i = 0; i < studentCount; i++) {
            students[i].printStudent();
        }
    }

    public void reviewCourse() {
        System.out.println(teacher.getName() + " currently has " + studentCount + " " +
                "students in their " + courseName + " course.\n");
        printStudents();
    }

    public static void main(String[] args) {
        Course c1 = new Course("Programming with Objects");

        c1.setTeacher(new Teacher("Rob Jahn", "32545632"));
        c1.addStudent(new Student("Alex Simpson", "23456575643", "Computer Science"));
        c1.addStudent(new Student("John Doe", "24356524124", "Computer Science"));

        c1.reviewCourse();
    }
}
