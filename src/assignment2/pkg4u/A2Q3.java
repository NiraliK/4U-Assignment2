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
public class A2Q3 {

    //triangle method created to find the sum of the triangle 
    public int triangle(int n) {
        //if n is equal to 0 then 0 is returned 
        if (n == 0) {
            return n;
        }
        //add n to the value before n (n-1)
        int answer = n + triangle(n - 1);
        //return the answer 
        return (answer);
    }

    public static void main(String[] args) {
        A2Q3 test = new A2Q3();
        int sample1 = test.triangle(0);
        System.out.println("Trangle(0): " + sample1);
        int sample2 = test.triangle(1);
        System.out.println("Trangle(1): " + sample2);
        int sample3 = test.triangle(2);
        System.out.println("Trangle(2): " + sample3);
        int sample4 = test.triangle(3);
        System.out.println("Trangle(3): " + sample4);

    }

}
