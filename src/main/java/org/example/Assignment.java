package org.example;


import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Random;
@Getter
@Setter
public class Assignment {
    private String assignmentId;
    private String assignmentName;
    private double weight;
    private int maxScore;
    private double assignmentAverage;
    private ArrayList<Integer> scores;
    private static int nextId = 1;

    /**
     * Calculates the overall average of all assignments
     */
    public void calcAssignmentAvg() {
        int sum = 0;
        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i);
        }
        double average = (double) sum / scores.size();
        average = Math.round(average * Math.pow(10, 1)) / Math.pow(10, 1);
        assignmentAverage = average;
    }

    /**
     * Generates a random score
     */
    public void generateRandomScore() {

        Random rand = new Random();

        for (int i = 0; i < scores.size(); i++) {

            int firstRandomNum = rand.nextInt(0, 11);

            int score = switch (firstRandomNum) {
                case 0 -> rand.nextInt(0, 60);
                case 1, 2 -> rand.nextInt(60, 70);
                case 3, 4 -> rand.nextInt(70, 80);
                case 5, 6, 7, 8 -> rand.nextInt(80, 90);
                case 9, 10 -> rand.nextInt(90, 101);
                default -> 0;
            };
            scores.set(i, score);
        }
    }
    public Assignment(String assignmentName, double weight, int maxScore){
        this.assignmentId = "A" + String.format("%06d" , Assignment.nextId++);
        this.assignmentName = assignmentName;
        this.weight = weight;
        this.maxScore = maxScore;
        this.scores = new ArrayList<>();
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
