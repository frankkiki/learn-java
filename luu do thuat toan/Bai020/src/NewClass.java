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
        
        int x = input.nextInt();
        
        int x2 = x * x;
        
        int x4 = x2 * x2;
        
        int x8 = x4 * x4;
        
        int x14 = x8 * x8 / x4;
        
        System.out.println("x14 = " + x14);
        
    }
}
