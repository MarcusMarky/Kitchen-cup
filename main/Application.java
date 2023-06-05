//HW1P4: In package "main" creati clasa "Application" cu metoda "main()"

package main;

import kitchen.Cup;
import kitchen.SmallCup;
import kitchen.BigCup;

public class Application {
    public static void main(String[] args) {
        
        Cup cupB = new Cup("Water", 500);

//HW2P3: Creați 1 cana mică de ceai (200 ml) afișați informații despre aceasta!

        SmallCup sCup = new SmallCup();
        
        sCup.setLiquidName("Tea");
        sCup.setLiquidVolume(200);

        System.out.println("\nSmall cup: " + sCup +" ml\n");
/* HW2P4: creați o cană mare în main() unde există deja 200 ml de apă
 turnați toată apa rămasă din cupB (part1) în această cană mare, afișați informațiile pe ecran! */      
         
        BigCup cupL = new BigCup();

        cupL.setLiquidName("Water");
        cupL.setLiquidVolume(200);

 System.out.println("Before pouring water into Big cup: "+ cupL + " ml\n");

        cupL.setLiquidVolume(cupL.getLiquidVolume() + cupB.getLiquidVolume());
        
        System.out.println("After pouring water into Big cup: "+ cupL + " ml\n");

    }
}