/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package no6;

import java.util.Scanner;

/**
 *
 * @author Windows 8.1
 */
public class No6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hasil;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Bilangan : " );
        int n = s.nextInt();
        
        hasil = (int) Math.pow(2,n);
        System.out.println("2 pangkat "+ n + " = " + hasil);
                
    }
    
}
