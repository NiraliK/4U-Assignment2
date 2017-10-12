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
public class Quiz {

    //Make a String that will reverse a word. For example: frog -> gorf
    //recursive method created 
    public String reverseString(String word) {
        //base is returned if the word is 1 or 0 letters long 
        if (word.length() == 0 || word.length() == 1) {
            //word returned 
            return word;
        }
        //String created to store the answer 
        //the method is run again: switching the last letter with the first letter 
        String answer = reverseString(word.substring(1)) + word.charAt(0);
        //answer is returned 
        return answer;
    }

    public static void main(String[] args) {
        //test created 
        Quiz test = new Quiz();
        //test one example 
        System.out.println("FROG reversed is: " + test.reverseString("FROG"));
    }

}
