/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aniruddha
 */
public class Main {
    
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        System.out.println("Animal Location - "+animal.getLocation());
        
        Car car = new Car();
        System.out.println("Car Location - "+car.getLocation());
        // string + anything = string
        
        GpsListener gpsAnimal = new Animal();
        
        GpsListener gpsCar = new Car();
        
        Locator locator = new Locator();
        locator.locate(gpsCar);
        locator.locate(gpsAnimal);
        locator.locate(animal);
        locator.locate(car);
        
        
        
        
    }
}
