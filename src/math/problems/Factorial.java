package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {
    public static int findFactorial(int i, int n) {
        return 0;
    }

    public static void findFactorial () {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int i,j = 1;
        int number = 5;
        for(i=1; i<=number; i++){
            j = j*i;
}
System.out.println("factorial of " + number + " is " +j);
    }
}
