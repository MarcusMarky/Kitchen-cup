package kitchen;
// HW2P1: Adăugați cod in loc de ??? atunci când declarați clasa mostenitoare

public class SmallCup extends Cup {
    
/* W2P2: Redefiniti comportamentul setter-ului pentru volumul de lichid din interior
astfel încât să vă permită doar setarea intervalului 0..250 ml */
private static final int MAX_VOLUME = 250;

    public SmallCup() {
        super();
        this.maxVolume = MAX_VOLUME;
    }
} 

