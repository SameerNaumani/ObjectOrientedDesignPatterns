/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author Sameer Naumani
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    
    private static Singleton instance;
    
    private Singleton(){
        
    }
    
    public static Singleton getInstance(){
        if(instance == null)
            instance  = new Singleton();
        
        System.out.println("Created one isntance");
        return instance;
    }
    
    
    
    public static void main(String[] args) {
        
        Singleton s = Singleton.getInstance();
        
    }
    
}
