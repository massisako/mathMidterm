package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {


    int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


    static void getMissingNo1(int[] a, int n) {}

    static int getMissingNo(){
        int n = 0;
        int total = (n + 1) * (n + 2) / 2;
        int i;
        int[] a = new int[0];
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }
   // public static void main(String args[])
    {
       // int a[] = { 10, 2, 1, 4, 5, 3, 7, 8, 6};
        int miss = getMissingNo();
        System.out.println("the missing number is " + miss);
    }
}



/*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */



