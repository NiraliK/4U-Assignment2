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
public class A2Q4 {

    public int hailstone(int n) {
        //print out n 
        System.out.println(n);
        //if n is 1 then he sequence stops 
        if (n == 1) {
            return n;
        }
        //if n is a even number then its divided by 2
        if (n % 2 == 0) {
            hailstone(n / 2);
        //if n is a odd number multiply by 3 and add 1    
        } else {
            hailstone(3 * n + 1);
        }
        //return n;
        return n;
    }

    public static void main(String[] args) {
        //test variable created 
        A2Q4 test = new A2Q4();
        //print out testing 
        System.out.println("Hailstone(5): ");
        test.hailstone(5);
        System.out.println("Hailstone(12): ");
        test.hailstone(12);
    }

}
