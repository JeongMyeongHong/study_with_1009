package com.with1009.slayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SlayerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlayerApplication.class, args);
        Scanner scanner = new Scanner(System.in);

        System.out.println("원하시는 메뉴를 선택해주세요.");
        System.out.println("1. 무기관리 2. 없어");
        int menunum = scanner.nextInt();
        switch (menunum){
            case 1:

            case 2:
                System.out.println("2번부터는 없어요.ㅋ");
            case 3:
                System.out.println("3번도 없지요ㅋㅋ");
        }
    }

}
