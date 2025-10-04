package com.pluralsight;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TestStatistics {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 88, 92, 76, 95, 89, 84, 91};

        int highest = 0;
        int lowest = 100;
        int sum = 0;

        for(int score : scores){
            sum += score;
            highest = Math.max(highest, score);
            lowest = Math.min(lowest,score);

        }
        float average = (float)sum/ scores.length;
        System.out.println(average);
        System.out.println(highest);
        System.out.println(lowest);

    }
}