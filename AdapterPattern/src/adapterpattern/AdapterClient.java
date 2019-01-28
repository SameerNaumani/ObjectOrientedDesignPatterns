/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author Sameer Naumani
 */
public class AdapterClient {

    /**
     * @param args the command line arguments
     */
    
    public Adaptee usb;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Adaptee a = new Adaptee();
        
        Adapter usb = new Adapter(a);
        
        usb.typeC();
    }
    
}
