//HW1P4: Plasati clasa "Cup" in package "kitchen" 

package kitchen;

public  class Cup {
//HW1P1: LiquidName - denumirea lichidului din interior | liquidName - denumirea lichidului din interior    
//HW1P1: Alegeti tipurile "TypeA" si "TypeB" astfel incat clasa sa corespunda descrierii de mai sus
//HW1P2: INTERBARE - Se aplica oare capsula asupra acestei clase? Da, se aplica capsula asupra acestei clase.

private String liquidName; 
protected int liquidVolume;
protected int maxVolume;

public Cup() {
    this.maxVolume = 600;
}

public Cup(String liquidName, int liquidVolume) {
    this.liquidName = liquidName;
    this.liquidVolume = liquidVolume;
    this.maxVolume = 600;
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

public int getMaxVolume() {
    return maxVolume;
}


//b: Volumul lichidului nu poate depasi 600ml si nu poate fi negativ!

public void setLiquidVolume(int liquidVolume) {
    
    if (liquidVolume >= 0 && liquidVolume <= getMaxVolume()){
    this.liquidVolume = liquidVolume;
} else {
    System.out.println("This cup is not compatible with this volume!");
   }
}
public String toString() {
    return   liquidName + " " + liquidVolume ;
   }
   
}
