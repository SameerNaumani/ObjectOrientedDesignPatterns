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
public class Listed extends ToDoListAbstraction {
    
    public Listed(ToDoListImplementor i) {
        super(i);
    }

    @Override
    public void sortList() {
        //Sort the List
    }

    @Override
    public void printList() {
        System.out.println("Listed ToDoList");
    
    }
    
    
}
