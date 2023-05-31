//HW1P4: In package "main" creati clasa "Application" cu metoda "main()"
package Main;

import Kitchen.Cup;

public class Application {
    public static void main(String[] args) {
        
        Cup cupA = new Cup("Milk", 500);
        Cup cupB = new Cup("Water", 250);
 
        System.out.println(cupB);
    }
}