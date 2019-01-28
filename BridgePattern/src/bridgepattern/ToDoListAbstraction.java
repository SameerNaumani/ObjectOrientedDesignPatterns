/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

/**
 *
 * @author Sameer Naumani
 */
public abstract class ToDoListAbstraction {
    public ToDoListImplementor imp;
    
    public ToDoListAbstraction(ToDoListImplementor i){
        this.imp=i;
    }
    
    public abstract void sortList();
    public abstract void printList();
    
}
