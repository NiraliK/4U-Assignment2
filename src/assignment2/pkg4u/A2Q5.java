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
public class A2Q5 {

    public String binaryConvert(int n) {
        // string created to store the 0 and 1 
        String binary = new String();

        //statement created to add a 0 if n is even 
        if (n % 2 == 0) {
            binary = ("0");
            // but if n is odd then add 1            
        } else if (n % 2 == 1) {
            binary = ("1");
        }
        //if n is 1 then return 1 
        if (n == 1) {
            return binary;
        }
        //taking n without the last digit 
        String answer = binaryConvert(n / 2) + binary;
        //return the binary 
        return answer;
    }

    public static void main(String[] args) {
        //test created for A2Q5 
        A2Q5 test = new A2Q5();
        //testing different samples 
        String sample1 = test.binaryConvert(18);
        System.out.println("Binary converet 18: " + sample1);
        String sample2 = test.binaryConvert(35);
        System.out.println("Binary converet 35: " + sample2);
        String sample3 = test.binaryConvert(65);
        System.out.println("Binary converet 65: " + sample3);
    }

}
