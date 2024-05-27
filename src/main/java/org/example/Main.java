package org.example;

import org.example.util.Util;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Address.isPostalCodeValid("H4p3K6"));
        System.out.println(Department.validateDepartmentName("dsjkkswk    4wemd"));
        System.out.println(Util.ToTitleCase("fGjK lKaM"));

        Department department1 = new Department("Science");
        Department department2 = new Department("Math");

        Address address1 = new Address(3750, "Lake", "Montreal", "QC", "H4R 4t4", "Canada");
        Address address2 = new Address(45, "Manuel", "Montreal", "QC", "H3T 4t4", "Canada");

        Student student1 = new Student("Cos" , Gender.MALE, address1 , department1);
        Student student2 = new Student("Anna" , Gender.FEMALE, address2 , department2);

        System.out.println(student1);
        System.out.println(student2);

        Course course1 = new Course("Cal1", 3, department1);
        course1.registerStudent(student1);
        course1.registerStudent(student2);
        course1.generateScores();
        course1.displayScores();

        Course course4 = new Course("Course 1", 2, new Department("Math"));
        course4.addAssignment("Assignment1", 50, 100);
        course4.addAssignment("Assignment2", 50, 100);
        System.out.println(course4.isAssignmentWeightValid());

        Course course5 = new Course("Course 1", 2, new Department("Math"));
        course5.addAssignment("Assignment1", 50, 100);
        course5.addAssignment("Assignment2", 50, 100);
        Student student5 = new Student("Cosi", Gender.MALE , null, course5.getDepartment());
        course5.registerStudent(student5);

        Integer integer = Integer.getInteger("50");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(integer);

        course5.getAssignments().get(0).setScores(scores);
        int aScore = course5.getAssignments().get(0).getScores().get(0);

        int studentAverage = course5.calcStudentAvg()[0];
        System.out.println("student average is: " + studentAverage);

    }
}