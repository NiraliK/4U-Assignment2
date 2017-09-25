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
public class A2Q6 {

    // convert method created 
    public String convert(int n, int x) {
        // string created to store the numbers 
        String numb = new String();
        //letters a to f are put into a string 
        String[] letters = {"A", "B", "C", "D", "E", "F"};
        //if n is able to convert into a number  
        if (n % x >= 10) {
            // letters added from the string 
            numb = numb + letters[n % x - 10];
            //else if the number doesnt convert into a letter then add the convereted number
        } else if (n % x >= 2 || n % x < 10) {
            numb = numb + n % x;
        }
        //number is returned when it is 0 
        if (n / x == 0) {
            return numb;
        }
        //number is divided and base int 
        String answer = convert(n / x, x) + numb;
        //return the answer 
        return answer;
    }

    public static void main(String[] args) {
        //test created 
        A2Q6 test = new A2Q6();
        //testing the samples 
        String sample1 = test.convert(1000, 15);
        System.out.println("Convert(1000,15):" + sample1);
        String sample2 = test.convert(1000, 16);
        System.out.println("Convert(1000,16):" + sample2);
        String sample3 = test.convert(1000, 2);
        System.out.println("Convert(1000,2):" + sample3);
    }

}
