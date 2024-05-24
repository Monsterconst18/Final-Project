package org.example;


import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId;

    /**
     * Calculates the overall average of all assignments
     */
    public void calcAssignmentAvg() {
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }
        assignmentAverage = (double) sum / scores.size();
    }

    /**
     * Generates a random score
     */
    public void generateRandomScore() {

        Random rand = new Random();
        int firstRandomNum = rand.nextInt(0,11);

        int score = switch (firstRandomNum) {
            case 0 -> rand.nextInt(0,60);
            case 1, 2 -> rand.nextInt(60,70);
            case 3, 4 -> rand.nextInt(70,80);
            case 5, 6, 7, 8 -> rand.nextInt(80,90);
            case 9, 10 -> rand.nextInt(90,101);
            default ->  0;
        };
    }
    @Override
    public String toString() {
        return "Assignment{" +
                "assignmentId='" + assignmentId + '\'' +
                ", assignmentName='" + assignmentName + '\'' +
                ", weight=" + weight +
                ", maxScore=" + maxScore +
                '}';
    }
}
