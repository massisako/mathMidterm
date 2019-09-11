package string.problems;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.AssertJUnit.*;


public class UnitTestingStringProblem {
   // public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.


    @Test
    public void testAnagram() {
        System.out.println("Testing isAnagram method:");
        assertTrue(Anagram.isAnagram("School master", "The classroom"));
        assertTrue(Anagram.isAnagram("Debit card", "Bad credit"));
        assertFalse(Anagram.isAnagram("Race car", "Cars race"));
    }

    @Test
    public void testisPalindrome() {

        ArrayList<String> truePalindromes = new ArrayList<>();
        ArrayList<String> falsePalindromes = new ArrayList<>();
        truePalindromes.add("NEVEN");
        truePalindromes.add("GEORGE");
        truePalindromes.add("Noon");
        falsePalindromes.add("Sister");
        falsePalindromes.add("Moon");


        System.out.println("Testing isPalindrome method:");
        for(String s: truePalindromes)
            assertTrue(Palindrome.isPalindrome(s));
        for(String s: falsePalindromes)
            assertFalse(Palindrome.isPalindrome(s));



    }
}
