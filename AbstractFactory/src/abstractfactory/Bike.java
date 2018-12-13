/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Sameer Naumani
 */

// This is optional. You can just instantiate the parts right in the main class
//
//


public class Bike {
    
    public BikeFactory bike;
    
    Wheel wheel;
    Frame frame;
    Gear gear;
    
    public Bike(Wheel w, Frame f, Gear g){
       this.wheel = w;
       this.frame = f;
       this.gear = g;
      
    }
    
}
