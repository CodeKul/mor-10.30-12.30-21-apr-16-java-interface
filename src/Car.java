/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aniruddha
 */
public class Car implements GpsListener{
    
    int wheels;
    
    void speedUp(){
        
        wheels++;
    }

    @Override
    public String getLocation() {
        return "Near Main Gate";
    }
}
