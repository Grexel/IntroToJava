/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

/**
 * Print a table
 * @author JeffreyMiller
 */
public class CH1Problem04 {
    public static void main(String[] args) {
        System.out.println("a\ta^2\ta^3");
        for(int i = 1; i < 5; i++){
            System.out.println(i + "\t" + (i*i) + "\t" + (i*i*i));
        }
    }
}
