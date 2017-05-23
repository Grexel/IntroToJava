/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 * Summation of a series from 1 ... 9
 * @author JeffreyMiller
 */
public class CH1Problem06 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 9; i++){
            sum += i;
        }
        System.out.println("The sum of the series 1 + 2 ... + 9 = " + sum);
    }
}
