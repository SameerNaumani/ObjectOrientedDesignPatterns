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
public class RFactory extends BikeFactory {

      @Override
    public Wheel createWheel() {
       return new RWheel();
    }

    @Override
    public Frame createFrame() {
        return new RFrame();
    }

    @Override
    public Gear createGear() {
        return new RGear();
    }
    
}
