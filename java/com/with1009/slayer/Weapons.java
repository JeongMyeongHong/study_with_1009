package com.with1009.slayer;

/*
*무기 클래스는 공격력, 강화수치, 각인수치로 구성된다.
공격력과 강화수치는 무기 단위로 관리되고, 각인수치는 무기 전체 공유된다.
무기 클래스에서 무기 생성, 무기 총 공격력 획득 기능,
강화 기능, 각인 기능을 제공해야함

기능 요구사항

공격력의 기본값은 1
강화수치, 각인수치의 기본값은 0
데미지는 공격력 + (강화수치 + 각인수치) * 10 로 계산
* */

import java.util.Scanner;

public class Weapons {
    static String hello = "무기 관리";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Weapon[] weapon = new Weapon[8];
        for(int i = 0; i<weapon.length; i++){
            weapon[i] = new Weapon();
        }

        while(true){
            System.out.println(Weapons.hello);
            System.out.println("1. 정보보기 2. 강화 3. 전체 공격력 보기");
            int menuNum = scanner.nextInt();

            if(menuNum == 1){//정보보기창
                System.out.println("무기의 번호 선택(0~7)");
                WeaponInfomation wi = new WeaponInfomation();
                int weaponNum = scanner.nextInt();
                wi.showInfo(weapon, weaponNum);
//                int showdmg = weapon[weaponNum].getTotalDMG(Weapon.getImprintingLV());
//                System.out.println(weaponNum+"번 무기의 데미지는 : "+showdmg+" 입니다.");
            }
            else if(menuNum == 2){//강화창
                System.out.println("1. 무기강화 2. 무기각인");
                int upgradeNum = scanner.nextInt();
                if (upgradeNum == 1) {//무기강화
                        System.out.println("무기의 번호 선택");
                        int weaponnum = scanner.nextInt();
                        weapon[weaponnum].upgradeWeapon();
                        System.out.println(weaponnum+"번 무기가 강화되었습니다.");
                    }
                else if (upgradeNum == 2){//무기각인
                    Weapon.upgradeImprintingLV();
                    System.out.println("무기각인이 되었습니다.");
                }
            }
            else if(menuNum == 3) {//전체 공격력 보기
                for(int i = 0; i<weapon.length; i++){
                    System.out.println(i+"번 무기 공격력 : "+weapon[i].getTotalDMG(Weapon.getImprintingLV()));
                }
            }
        }
    }
}
