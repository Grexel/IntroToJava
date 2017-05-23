/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 * Approximate pi
 * @author JeffreyMiller
 */
public class CH1Problem07 {
    public static void main(String[] args) {
        System.out.println("Result of pi approx to 6 terms, ending in -1/11: " + approximatePI(6));
        System.out.println("Result of pi approx to 7 terms, ending in +1/13: " + approximatePI(7));
    }
    public static double approximatePI(int numberOfTerms){
        double multiplier = 0;
        for(int i = 1; i <= numberOfTerms; i++){
            double termValue = 1.0 / (i*2.0 - 1.0);
            if(i % 2 == 1) // first and every other terms are added
            {
                multiplier += termValue;
            }
            else{
                multiplier -= termValue;
            }
        }
        return 4 * multiplier;
    }
}
