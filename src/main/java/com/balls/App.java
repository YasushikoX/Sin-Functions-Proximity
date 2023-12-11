package com.balls; //THEY DO NOT ALLING AGAIN

public class App 
{
    public static void main( String[] args )
    {
        double x;
        double g = 9.807;
        double step = 1;
        double tolerance = 0.0001;
        boolean solutionFound = false;

        x = 10;
        while (x <= 1000000000) {
            double equation1 = Math.cos(Math.sqrt(0.2/g)*x);
            double equation2 = Math.cos(Math.sqrt(0.21/g)*x);
            double equation3 = Math.cos(Math.sqrt(0.22/g)*x);
            double equation4 = Math.cos(Math.sqrt(0.23/g)*x);
            double equation5 = Math.cos(Math.sqrt(0.24/g)*x);

            if (Math.abs(equation1 - equation2) <= tolerance &&
                Math.abs(equation2 - equation3) <= tolerance &&
                Math.abs(equation3 - equation4) <= tolerance &&
                Math.abs(equation4 - equation5) <= tolerance) {
                System.out.println(x);
                solutionFound = true;
            }
            x += step;
        }

        if (!solutionFound) {
            System.out.println("No solution was found.");
        }
    }
} 