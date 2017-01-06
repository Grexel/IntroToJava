/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

import java.util.Scanner;

/**
 * Intersecting point of two lines equation to find the x and y are: 
 * (y1-y2)x - (x1-x2)y = (y1-y2)x1 - (x1-x2)y1;
 * (y3-y4)x - (x3-x4)y = (y3-y4)x3 - (x3-x4)y3;
 *
 * Cramers rule is 
 * ax + by = e;
 * cx + dy = f; 
 * x = (ed-bf)/(ad-bc) 
 * y = (af-ec)/(ad-bc);
 *
 * @author JeffreyMiller
 */
public class Problem25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double a = y1 - y2;
        double b = x1 - x2;
        double e = a * x1 - b * y1;
        double c = y3 - y4;
        double d = x3 - x4;
        double f = c * x3 - d * y3;
        if(a*d - b*c == 0){
            System.out.println("The two lines are parallel.");
        }
        else{
            double pX = cramerX(a,b,c,d,e,f);
            double pY = cramerY(a,b,c,d,e,f);
            System.out.println("The intersecting point is at (" + pX +", " + pY + ")");
        }
    }

    //if a*d - b*c == 0, there is no solution.
    public static double cramerX(double a, double b, double c, double d, double e, double f) {
        return (e * d - b * f) / (a * d - b * c);
    }

    public static double cramerY(double a, double b, double c, double d, double e, double f) {
        return (a * f - e * c) / (a * d - b * c);
    }
}
