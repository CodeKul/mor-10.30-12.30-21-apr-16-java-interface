/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aniruddha
 */
public class Animal implements  GpsListener{
    
   int legs;
   
   void run(){
       
       legs++;
   }

    @Override
    public String getLocation() {
        return "North Jungle";
    }
}
