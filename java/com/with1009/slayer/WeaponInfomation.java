package com.with1009.slayer;

public class WeaponInfomation {

    public static void showInfo(Weapon[] weapon, int weaponNum){
        int showdmg = weapon[weaponNum].getTotalDMG(Weapon.getImprintingLV());
        System.out.println(weaponNum+"번 무기의 데미지는 : "+showdmg+" 입니다.");
    }
}
