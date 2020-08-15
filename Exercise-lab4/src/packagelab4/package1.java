/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packagelab4;
import pack.*;
import pack.subpack.*;
import pack1.*;
import pack1.subpack.*;

/**
 *
 * @author INTEL
 */
public class package1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Accessing package 1");
        first s=new first();
        s.display();
        second s1=new second();
        s1.display();
        System.out.println("Accessing package 2");
        third s2=new third();
        s2.display();
        fourth s3=new fourth();
        s3.display();
    }
    
}
