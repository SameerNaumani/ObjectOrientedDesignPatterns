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
public abstract class BikeFactory {
    
    public abstract Wheel createWheel();
    public abstract Frame createFrame();
    public abstract Gear createGear();
    

}
