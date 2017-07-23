/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertstringtoint;

import java.util.Scanner;


/**
 *
 * @author jani
 */
public class ConvertStringToInt {
    static int x = 0;
    static int counter = 0;

    /**
     * @param args the command line arguments
     */
        
        // input
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Converted to integer:" + Recursive(s));
    }
    
    
    // recursive method
    public static int Recursive(String s) {
        if (s.length() == 1) {
            x = (x * 10) + Integer.parseInt(s.substring(0, 1));
            return x;
        } else {
            x = (x * 10) + Integer.parseInt(s.substring(0, 1));
           // counter++;
           // System.out.println("x= " + x);
            //System.out.println("Integer.parseInt(s.substring(0, 1)= " + Integer.parseInt(s.substring(0, 1)));
           // System.out.println("s.length()= " + s.length());
            return Recursive(s.substring(1, s.length()));

        }

    }
    
}