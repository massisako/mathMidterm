package math.problems;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class UnitTestingMath {


    @Test
    public static void test1 (){
        Factorial.findFactorial();
    }

    @Test
    public static void test2(){
        Fibonacci.findFibonacci();
    }

    @Test
    public static void test3 (){
        FindLowestDifference.FindLowestDifference();
    }

    @Test
    public static void test4 () {
        FindMissingNumber.getMissingNo();
    }

    @Test
    public static void test5 () {
        LowestNumber.lowestNumber();
    }

    @Test
    public static void test6 () {
        MakePyramid.makePyramid();
    }

    @Test
    public static void test7 () {
        Pattern.patern();
    }

    @Test
    public static void test8 () {
        PrimeNumber.primeNumber();
    }

    //public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

    }

