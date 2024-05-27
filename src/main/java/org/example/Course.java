package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

// Lombok generated methods
@EqualsAndHashCode
@Getter
@Setter
// Fields
public class Course {
    private String courseId;
    private String courseName;
    private double credits;
    private Department department;
    private ArrayList<Assignment> assignments;
    private ArrayList<Student> registeredStudents;
    private ArrayList<Double> finalScores;
    private static int nextId = 1;
    // 3 args constructor
    public Course(String courseName, double credits, Department department) {
        this.courseId = "C-" + department.getDepartmentId() + "-" + String.format("%02d", Course.nextId++);
        this.courseName = courseName;
        this.credits = credits;
        this.department = department;
        this.assignments = new ArrayList<>();
        this.registeredStudents = new ArrayList<>();
        this.finalScores = new ArrayList<>();
    }
    /**
     * Checks if assignment weight is valid
     *
     * @return true or false to determine if assignment weight is valid
     */
    public boolean isAssignmentWeightValid() {
        double weightSum = 0;
        for (int i = 0; i < assignments.size(); i++) {
            weightSum += assignments.get(i).getWeight();
        }
        weightSum = weightSum/100;
        if (weightSum == 1.0) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Checks if a student is registered to a specific course
     *
     * @param student
     * @return a response for course registration
     */
    public boolean registerStudent(Student student) {
        if (registeredStudents.contains(student)) {
            return false;
        } else {
            this.registeredStudents.add(student);

            for (int i = 0; i < assignments.size(); i++) {
                assignments.get(i).getScores().add(null);
            }
            finalScores.add(null);
            return true;
        }
    }
    /**
     * Calculates the overall average of each student in the class
     *
     * @return the average of each student in the class
     */
    public int[] calcStudentAvg() {
        int[] StudentAverages = new int[registeredStudents.size()];
        // Use for loop to get the averages of all students
        for (int i = 0; i < registeredStudents.size(); i++) {
            double sum = 0;
            for (int j = 0; j < assignments.size(); j++) {
                Integer score = assignments.get(j).getScores().get(i);
                if (score != null) {
                    sum += score * assignments.get(j).getWeight();
                }
            }
            StudentAverages[i] = (int) Math.round(sum);
        }
        return StudentAverages;
    }
    /**
     * Adds a new assignment to each student
     *
     * @param assignmentName the name of the assignment
     * @param weight the weight of each assignment
     * @param maxScore the highest score of all assignments
     * @return any new assignment if necessary
     */
    public boolean addAssignment(String assignmentName, double weight, int maxScore) {
        assignments.add(new Assignment(assignmentName, weight, maxScore));
        return true;
    }
    /**
     * Generates random scores for each assignment
     */
    public void generateScores() {
        for (int i = 0; i < assignments.size(); i++) {
            Assignment tempAssignment = assignments.get(i);
            tempAssignment.generateRandomScore();
            tempAssignment.calcAssignmentAvg();
        }

        int[] averages = calcStudentAvg();
        for (int i = 0; i < averages.length; i++) {
            finalScores.set(i, (double) averages[i]);
        }
    }
    /**
     * Displays the scores of each course in a table
     */
    public void displayScores() {
        System.out.println("Course: " + courseName + " (" + courseId + ")");

        for (int i = 0 ; i < assignments.size() ; i++){
            System.out.print(assignments.get(i).getAssignmentName() + "   ");
        }
        System.out.println("Final Score");
        //trying a enhanced for loop here, probably should have used it more
        for (Student student : registeredStudents) {
            System.out.print(student.getStudentName() + "  ");
            for (Assignment assignment : assignments) {
                System.out.print(assignment.getScores().get(registeredStudents.indexOf(student)) + "   ");
            }
            System.out.println(finalScores.get(registeredStudents.indexOf(student)));
        }
        System.out.print("Average  " );

        for (Assignment assignment : assignments) {
            System.out.print(assignment.getAssignmentAverage() + "   ");
        }
        System.out.println();
    }
    // toSimplifiedStringMethod
    /**
     * Converts a course to a simple string
     *
     * @return the simplified string
     */
    public String toSimplifiedString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department.getDepartmentName() +
                '}';
    }
    // toString method
    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                ", credits=" + credits +
                ", department=" + department +
                ", assignments=" + assignments +
                ", registeredStudents=" + registeredStudents +
                '}';
    }
}
