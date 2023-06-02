package kitchen;
// HW2P1: Adăugați cod in loc de ??? atunci când declarați clasa mostenitoare

public class SmallCup extends Cup {
    
/* W2P2: Redefiniti comportamentul setter-ului pentru volumul de lichid din interior
astfel încât să vă permită doar setarea intervalului 0..250 ml */

public void setLiquidVolume(int liquidVolume) {
    if (liquidVolume >= 0 && liquidVolume <= 250) {
        super.liquidVolume = liquidVolume;
    } else {
   System.out.println("This cup is not compatible with this volume!");

}
}
}