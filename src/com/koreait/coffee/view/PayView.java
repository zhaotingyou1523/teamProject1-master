package com.koreait.coffee.view;

import java.util.Scanner;

public class PayView {
    public MainView mainView = new MainView();
    public Scanner sc = new Scanner(System.in);

    public void payView(){
        while (true){

            System.out.print("결제하시겠습니까? 1.OK   2.NO");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:

                    return;
                default:
                    return;
            }
        }


    }
    public void pointView(){



    }
    public void paySuccess(){
        System.out.println("결제 성공");
        mainView.mainView();
    }
}
