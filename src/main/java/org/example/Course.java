package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@EqualsAndHashCode
@Getter
@Setter

public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
    private static int nextId;

    /**
     * Checks if assignment weight is valid
     * @return true or false to determine if assignment weight is valid
     */
    public boolean isAssignmentWeightValid() {
        //TODO: To be implemented
        return false;
    }

    /**
     * Checks if a student is registered to a specific course
     * @param student
     * @return a response for course registration
     */
    public boolean registerStudent(Student student) {
        //TODO: To be implemented
        return true;

    }

    /**
     * Calculates the overall average of each student in the class
     * @return the average of each student in the class
     */
    public int[] calcStudentsAverage() {
        //TODO: To be implemented
        return new int[]{9, 5, 3, 7, 6};

    }

    /**
     * Adds a new assignment to each student
     * @param assignmentName the name of the assignment
     * @param weight the weight of each assignment
     * @param maxScore the highest score of all assignments
     * @return any new assignment if necessary
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        //TODO: To be implemented
        return false;
    }

    /**
     * Generates random scores for each assignment
     */
    public void generateScores() {
        //TODO: To be implemented
    }

    /**
     * Displays the scores of each course in a table
     */
    public void displayScores() {
        //TODO: To be implemented

    }
}
