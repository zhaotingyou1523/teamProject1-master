package com.koreait.coffee.view;

import java.util.Scanner;

public class OrderView {
    public Scanner sc = new Scanner(System.in);

    public void orderView(){
        while (true){

            System.out.println("1.아이스   2.핫");
            int chooseTemp = 0;
            try {
                chooseTemp = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            switch (chooseTemp){
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("선택안함");
                    break;
            }
            System.out.println("1.연하게   2.1샷추가   3.2샷추가");
            int chooseShot = 0;
            try {
                chooseShot = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            switch (chooseShot){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("선택안함");
                    return;
            }
        }
    }
}
