package com.with1009.slayer;

public class Weapon {
    private int attdmg = 1;
    private int upgradeLV = 0;
    private static int imprintingLV = 0;

    public Weapon(){

    }

    public int getTotalDMG(int imprintingLV){
        return attdmg + (upgradeLV + imprintingLV)*10;
    }

    void upgradeWeapon() {
        upgradeLV++;
    }
    public static void upgradeImprintingLV() {
        imprintingLV++;
    }
    public static int getImprintingLV(){
        return imprintingLV;
    }
}
