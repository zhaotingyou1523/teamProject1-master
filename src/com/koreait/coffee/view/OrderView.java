package com.koreait.coffee.view;

import com.koreait.coffee.model.dto.Shot;
import com.koreait.coffee.model.dto.Temperature;

import java.util.Scanner;

public class OrderView {
    public Scanner sc = new Scanner(System.in);

    public Temperature temperatureView(){
        while (true) {

            System.out.println("1.아이스   2.핫");
            int chooseTemp = 0;
            try {
                chooseTemp = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            return switch (chooseTemp) {
                case 1 -> Temperature.ICE;
                case 2 -> Temperature.HOT;
                default -> {
                    System.out.println("선택안함");
                    yield null;
                }
            };
        }

        }
        public Shot shotView(){
        while (true) {
            System.out.println("1.연하게   2.1샷추가   3.2샷추가");
            int chooseShot = 0;
            try {
                chooseShot = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            return switch (chooseShot) {
                case 1 -> Shot.HALF;
                case 2 -> Shot.PLUS_ONE;
                case 3 -> Shot.PLUS_TWO;
                default -> {
                    System.out.println("선택안함");
                    yield null;
                }
            };
        }
        }

    }
