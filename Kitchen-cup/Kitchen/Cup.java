//HW1P4: Plasati clasa "Cup" in package "kitchen" 
package Kitchen;

public class Cup {
//HW1P1: LiquidName - denumirea lichidului din interior | liquidName - denumirea lichidului din interior    
//HW1P1: Alegeti tipurile "TypeA" si "TypeB" astfel incat clasa sa corespunda descrierii de mai sus
//HW1P2: INTERBARE - Se aplica oare capsula asupra acestei clase? Da, se aplica capsula asupra acestei clase.
private String liquidName; 
private int liquidVolume;

public Cup() {
}

public Cup( String liquidName, int liquidVolume ) {
    this.liquidName = liquidName;
    this.liquidVolume = liquidVolume;
}

//HW1P3: Adaugati set/get pentru fiecare proprietate luand in consideratie ca
public String getLiquidName() {
    return liquidName;
}
//a: In canile acestei clase poate fi turnat doar "Water", "Milk","Tea"
public void setLiquidName(String liquidName) {
    if (liquidName.equals("Milk") || liquidName.equals("Water") || liquidName.equals("Tea")){
    this.liquidName = liquidName;
    } 
}

public int getLiquidVolume() {
    return liquidVolume;
}
//b: Volumul lichidului nu poate depasi 600ml si nu poate fi negativ!
public void setLiquidVolume(int liquidVolume) {
    if (liquidVolume > 0 && liquidVolume < 600){
    this.liquidVolume = liquidVolume;
} else {
    System.out.println("This cup is not compatible with this volume!");
   }
}
@Override

public String toString() {
    return   liquidName + " " + liquidVolume ;
   }
}
