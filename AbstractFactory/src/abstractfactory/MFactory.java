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
public class MFactory extends BikeFactory{
    

    @Override
    public Wheel createWheel() {
       return new MWheel();
    }

    @Override
    public Frame createFrame() {
        return new MFrame();
    }

    @Override
    public Gear createGear() {
        return new MGear();
    }
    

    
}
