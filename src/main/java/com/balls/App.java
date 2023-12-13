package com.balls; //THEY DO NOT ALLING AGAIN

public class App 
{
    public static void main( String[] args )
    {
        double x;
        double g = 1;
        double g2 = 2;
        double g3 = 3;
        double step = 1;
        boolean solutionFound = false;

        x = 10;
        while (x <= 1000000000) {
            double equation1 = Math.cos(g*x);
            double equation2 = Math.cos(g2*x);
            Double equation3 = Math.cos(g3*x);

            if (equation1 == equation2 && equation2 ==  equation3){
                System.out.printf("%.1f%n", x);
                solutionFound = true;
            }
            x += step;
        }

        if (!solutionFound) {
            System.out.println("No solution was found.");
        }
    }
} 