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
public class AbstractFactoryClient {

    private BikeFactory bike;
    
    public AbstractFactoryClient(BikeFactory b){
        this.bike = b;
        
        //You can also just instantiate the bike part within the client class constructor
        //However in this case we have decided to create a seperate class that will instantiate
        //all the parts
        
        //Wheel w = b.createWheel(); /
        //Frame f = b.createFrame();
        //Gear g = b.createGear();
        
    }
    
    public Bike newBike(){
        Wheel w = bike.createWheel();
        Frame f = bike.createFrame();
        Gear g = bike.createGear();
        
        return new Bike(w,f,g);
    }
    
     
    public static void main(String[] args) {
        
       AbstractFactoryClient a = new AbstractFactoryClient(new MFactory());
       a.newBike();
        
       AbstractFactoryClient b = new AbstractFactoryClient(new RFactory());
       b.newBike();
        
        
        
    }
    
}
