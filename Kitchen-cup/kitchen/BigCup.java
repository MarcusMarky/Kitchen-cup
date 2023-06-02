package kitchen;
//HW2P1: Adăugați cod in loc de ??? atunci când declarați clasa mostenitoare

public class BigCup extends Cup {
/* HW2P4: Declară clasa BigCup - succesorul Cup, după aceleași principii ca și SmallCup
 suprascrieti doar setter-ul pentru volumul cu un interval de 0..1000 ml */

 public void setLiquidVolume(int liquidVolume) {
    if (liquidVolume >= 0 && liquidVolume <= 1000) {
        super.liquidVolume = liquidVolume;
    } else {
   System.out.println("This cup is not compatible with this volume!");

}
}    
}
