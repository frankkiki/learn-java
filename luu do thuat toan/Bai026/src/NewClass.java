/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LPSang
 */
import java.util.Scanner;

public class NewClass {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a = ");
        
        int a = input.nextInt();
        
        System.out.print("Enter b = ");
        
        int b = input.nextInt();
        
        a = a + b;
        
        b = a - b;
        
        a = a - b;
        
        System.out.println("a = " + a + "b = " + b);
        
    }
}