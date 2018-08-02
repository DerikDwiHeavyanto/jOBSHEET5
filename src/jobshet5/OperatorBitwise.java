/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobshet5;

/**
 *
 * @author ASUS
 */
public class OperatorBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x= 12;
        int y= 15;
        
        int z;
        
        z = y | x;
        System.out.println("hasil = "+ z);
        
        z = y & x;
        System.out.println("hasil =" + z);
                
        z = ~x ;
        System.out.println("hasil =" + z);
        
        z = x^y;
        System.out.println("hasil ="+ z);
        
        z = x<<3;
        System.out.println("hasil ="+ z);
        
        z = x>>3;
        System.out.println("hasil ="+ z);
        
    }
    
}
