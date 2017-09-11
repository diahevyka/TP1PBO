/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no7;

import java.util.Scanner;

/**
 *
 * @author Windows 8.1
 */
public class No7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total=0;
        int min = 9999;
        int[] aray;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Jumlah Bilangan: ");
        int n = s.nextInt();
        
        aray = new int[n];
        for (int i = 0; i<n; i++)
        {
            System.out.print("Bilangan "+ (i+1) +" : ");
            aray[i] = s.nextInt();
            if (aray[i]<min)
            {
                min = aray[i];
            }
            else
            {
                min=min;
            }
            total += aray[i];
        }
        System.out.println("Nilai terendah : "+min);
        System.out.println("Total nilai : "+total);
    }
    
}
