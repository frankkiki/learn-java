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

public class Bai110 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of element: ");
        
        int n = input.nextInt();
        
        int[] a = new int[n];
        
        InputElement(a);
        
        OutputElement(a);
        
        int kq = TimGiaTri(a);
        
        if(kq != 0)
        {
             System.out.println("So nguyen to nho nhat ma lon hon cac gia tri"
                + " co trong mang la: " + kq);
        }
        else
        {
            System.out.println("Khong co so nguyen to");
        }
    }
    public static void InputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = (int)(Math.random() * (100 + 100) - 100);
        }
        System.out.println();
    }
    public static void OutputElement(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static int LonNhat(int[] a)
    {
        int lc = a[0];
        
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > lc)
            {
                lc = a[i];
            }
        }
        return lc;
    }
    public static boolean KtNguyenTo(int a)
    {
        int Dem = 0;
        
        for(int i = 1; i <= a; i++)
        {
            if(a % i == 0)
            {
                Dem++;
            }
        }
        if(Dem == 2)
        {
            return true;
        }
        return false;
    }
    public static int TimGiaTri(int[] a)
    {
        int lc = LonNhat(a);
        
        while(!KtNguyenTo(lc))
        {
            lc = lc + 1;
        }
        return lc;
    }
}

