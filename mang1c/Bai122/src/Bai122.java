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

public class Bai122
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = KtToanChan(a);
        if(kq != 0)
        {
            System.out.println("mang co ton tai toan so chan");
        }
        else
        {
            System.out.println("mang khong ton tai toan so chan");
        }
    }
    public static void InputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (100 + 100) - 100);
        }
    }
    public static void OutputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int KtToanChan(int[] a)
    {
        int Dem = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                Dem++;
            }
        }
        if(Dem == a.length)
        {
            return 1;
        }
        return 0;
    }
}
