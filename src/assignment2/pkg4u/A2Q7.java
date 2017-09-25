/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg4u;

/**
 *
 * @author niralikantaria
 */
public class A2Q7 {

    //method created to determine if the word entered in is a palindrome or not 
    public static boolean isPalindrome(String s, int length) {
        //if the length of the word is 1 or less then 1 than true is returned 
        if (length <= 1) {
            return true;
        }
        //string created for the first letter of the word 
        String first = s.substring(0, 1);
        //string created to store the last letter of the word 
        String last = s.substring(s.length() - 1, s.length());

        //if the word lengths match then you go through the loop 
        if (first.equals(last)) {
            //calling the method to see if the letters from the word match each other 
            //substring are used to seprate each letter 
            return isPalindrome(s.substring(1, length - 1), length - 2);
        } else {
            //if the letters in the word do not match up then a false statement is returned 
            return false;
        }

    }

    public static void main(String[] args) {
        //test created 
        A2Q7 test = new A2Q7();
        //testing and printing out
        //testing out a true statement 
        System.out.println("isPalindrome(racecar)-> " + (test.isPalindrome("racecar", 7)));
        //testing out a false statment 
        System.out.println("isPalindrome(lamont)-> " + (test.isPalindrome("lamont", 6)));
    }
}
