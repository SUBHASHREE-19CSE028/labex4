/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

/**
 *
 * @author INTEL
 */
public class distanceconverter {
    public double metretokm(double n)
    {
        double m;
        m=(n/1000);
        return m;
        
    }
    public double kmtometre(double n)
    {
        double km;
        km=(n*1000); 
        return km;
    }
    public double miletokm(double n)
    {
        double km;
        km=(n*1.609);
        return km;
    }
    public double kmtomile(double n)
    {
        double mile;
        mile=(n*0.621);
        return mile;
    }
}
