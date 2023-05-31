//HW1P4: In package "main" creati clasa "Application" cu metoda "main()"
package Main;

import Kitchen.Cup;

public class Application {
    public static void main(String[] args) {
        
        Cup cupA = new Cup("Milk", 300);
        Cup cupB = new Cup("Water", 500);
 
        System.out.println("Before pouring water: "+ cupA);
        System.out.println("Before pouring water: "+ cupB);
        
        cupA.setLiquidVolume(cupA.getLiquidVolume() - 50);
        
       
        cupB.setLiquidVolume(cupB.getLiquidVolume() + 50);
 
        System.out.println("\nAfter pouring water: "+ cupA);
        System.out.println("After pouring water: "+ cupB);
        
    }
}