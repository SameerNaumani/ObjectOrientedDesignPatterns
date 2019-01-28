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
public class Adapter extends Target {
    
    public Adaptee usb;
    
    public Adapter(Adaptee usb){
        this.usb = usb;
    }
    
    
    @Override
    public void typeC() {
        
        usb.typeUSB();
        System.out.println("Adapter for typeUSB to typeC conversion");
    }
    
}
