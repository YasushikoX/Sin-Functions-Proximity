package com.balls;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        double x;
        double g = 9.81;
        double step = 0.01;
        double tolerance = 0.005;
        boolean solutionFound = false;

        x = 10;
        List<Double> list = new ArrayList<>();
        while (x <= 1000000) {
            double equation1 = Math.cos(Math.sqrt(0.2/g)*x);
            double equation2 = Math.cos(Math.sqrt(0.21/g)*x);
            double equation3 = Math.cos(Math.sqrt(0.23/g)*x);
            double equation4 = Math.cos(Math.sqrt(0.24/g)*x);
            double equation5 = Math.cos(Math.sqrt(0.25/g)*x);

            if (Math.abs(equation1 - equation2) <= tolerance &&
                Math.abs(equation2 - equation3) <= tolerance &&
                Math.abs(equation3 - equation4) <= tolerance &&
                Math.abs(equation4 - equation5) <= tolerance) {
                list.add(x);
                solutionFound = true;
            }
            x += step;
        }

        if (!solutionFound) {
            System.out.println("No solution was found.");
        } else {
            System.out.println("The valid x values are: " + list);
        }
    }
} 