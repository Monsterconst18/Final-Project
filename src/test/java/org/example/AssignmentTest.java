package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AssignmentTest {
    // Tests to check if method is robust
    @Test
    public void calcAssignmentAvg1() {

        //ceate an assignment
        Assignment assignment = new Assignment("Assignment 1", 20, 100);

        //add scores
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(60);
        scores.add(80);
        scores.add(70);
        assignment.setScores(scores);

        //calculate the average
        assignment.calcAssignmentAvg();

        //set my exoectedResult and result
        double expectedResult = 70.0;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expectedResult,result);
    }
    @Test
    public void calcAssignmentAvg2() {

        //ceate an assignment
        Assignment assignment = new Assignment("Assignment 2", 20, 100);

        //add scores
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(55);
        scores.add(0);
        scores.add(88);
        assignment.setScores(scores);

        //calculate the average
        assignment.calcAssignmentAvg();

        //set my exoectedResult and result
        double expectedResult = 47.7;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expectedResult,result);
    }
}
