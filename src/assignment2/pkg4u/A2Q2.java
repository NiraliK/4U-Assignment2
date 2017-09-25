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
public class A2Q2 {

    //taken from question 1 
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

    //method created for calculating the digital root 
    public int digitalRoot(int n) {
        //digital sum from Q1 is used to replace n 
        n = digitalSum(n);
        //if n is a single digit then n is returned as its self 
        if (n <= 9 && n >= 0) {
            return n;
        }
        //digital root returned 
        return digitalRoot(digitalSum(n));
    }

    public static void main(String[] args) {
        //test variable created 
        A2Q2 test = new A2Q2();
        //testing and outputing 3 samples 
        int sample1 = test.digitalRoot(2019);
        System.out.println("The digital root of 2019 is: " + sample1);
        int sample2 = test.digitalRoot(126);
        System.out.println("The digital root of 126 is: " + sample2);
        int sample3 = test.digitalRoot(49);
        System.out.println("The digital root of 126 is: " + sample3);

    }

}
