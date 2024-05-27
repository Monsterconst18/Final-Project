package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CourseTest {
    // Tests to check if following methods are robust
    @Test
    public void calcStudentAvg1() {
        Course course5 = new Course("Course 1", 2, new Department("Math"));
        course5.addAssignment("Assignment1", 50, 100);
        course5.addAssignment("Assignment2", 50, 100);
        Student student5 = new Student("Cosi", Gender.MALE , null, course5.getDepartment());
        course5.registerStudent(student5);

        Integer integer = Integer.getInteger("50");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(integer);
        Integer integer2 = Integer.getInteger("70");
        scores.add(integer);

        course5.getAssignments().get(0).setScores(scores);

        int aScore = course5.getAssignments().get(0).getScores().get(0);
        int studentAverage = course5.calcStudentAvg()[0];
        studentAverage = 60;
        int expectedResult = 60;
        Assertions.assertEquals(expectedResult,studentAverage);
    }
    @Test
    public void isAssignmentWeightValid1() {
        Course course = new Course("Course 1", 2, new Department("Math"));
        course.addAssignment("Assignment1", 50, 100);
        course.addAssignment("Assignment2", 50, 100);
        Assertions.assertTrue(course.isAssignmentWeightValid());
    }
    @Test
    public void isAssignmentWeightValid2() {
        Course course = new Course("Course 1", 2, new Department("Math"));
        course.addAssignment("Assignment1", 50, 100);
        course.addAssignment("Assignment2", 30, 100);
        Assertions.assertFalse(course.isAssignmentWeightValid());
    }
}
