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
public class A2Q1 {

    //method created to calculate the digital sum  
    public int digitalSum(int n) {
        //if statement created to return n when it a single digit 
        if (n >= 0 && n <= 9) {
            return n;
        }
        //integer created for the digit farest on the right
        int mod = n % 10;
        //integer created without the farest right digit
        int divide = n / 10;
        //add the right most digit to the new number 
        int answer = mod + digitalSum(divide);
        //return the answer 
        return (answer);
    }

    public static void main(String[] args) {
        //test created to test assignment 2 
        A2Q1 test = new A2Q1();
        //testing the method created to find the digital sum
        int sample1 = test.digitalSum(962);
        int sample2 = test.digitalSum(7128);
        int sample3 = test.digitalSum(1907);
        //outputing (printing out) the final digit sum 
        System.out.println("Digital sum of 962 is: " + sample1);
        System.out.println("Digital sum of 7128 is: " + sample2);
        System.out.println("Digital sum of 1907 is: " + sample3);
    }

}
