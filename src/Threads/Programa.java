/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;

/**
 *
 * @author Náyron dos Anjos
 */
public class Programa implements Runnable{
    
    private int id;
    //colocar getter e setter pro atributo id
    
    public void run(){
        for(int i = 0;i<10000;i++){
            System.out.println("Programa " + getId() + "valor " + i);
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
