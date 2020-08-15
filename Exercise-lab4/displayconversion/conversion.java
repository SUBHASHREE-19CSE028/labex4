/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displayconversion;
import distance.*;
import java.util.*;
/**
 *
 * @author INTEL
 */
public class conversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        distanceconverter s = new distanceconverter();
        System.out.println("Enter the value in metres:");
        double m=obj.nextDouble();
        System.out.println(""+m+" metres ="+s.metretokm(m)+" kilometres");
        System.out.println("Enter the value in kilometres:");
        double k=obj.nextDouble();
        System.out.println(""+k+" kilometres ="+ s.kmtometre(k)+" metres");
        System.out.println("Enter the value in miles:");
        double mi=obj.nextDouble();
        System.out.println(""+mi+" miles ="+ s.miletokm(mi)+" kilometres");
        System.out.println("Enter the value in kilometres:");
        double km=obj.nextDouble();
        System.out.println(""+km+" kilometres ="+ s.kmtomile(km)+" miles");
        
    
    }
    
}
