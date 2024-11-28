package com.koreait.coffee.view;

import com.koreait.coffee.controller.ShoppingCartController;
import com.koreait.coffee.model.dto.ShoppingCart;
import com.koreait.coffee.model.dto.Type;

import java.util.Scanner;

public class MenuView {
    public OrderView orderView = new OrderView();
    public Scanner sc = new Scanner(System.in);
    public ShoppingCartController shoppingCartController = new ShoppingCartController();
    public void categoryView(Type type){
        while (true){
        System.out.println("1.커피   2.티   3.에이드&쥬스   4.음료   5.브레드   6.디저트");
            int choose = 0;
            try {
                choose = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }

            switch (choose){
            case 1:
                menuView(choose);
                break;
            case 2:
                menuView(choose);
                break;
            case 3:
                menuView(choose);
                break;
            case 4:
                menuView(choose);
                break;
            case 5:
                menuView(choose);
                break;
            case 6:
                menuView(choose);
                break;
            default:
                System.out.println("뒤로가기");
                return;
        }
        }


    }
    public void menuView(Integer categoryId){

        while (true) {
            System.out.println("1.아메리카노   2.바닐라라떼   3.카페라떼   4.카페모카");
            int choose = sc.nextInt();

            switch (choose){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("뒤로가기");
                    return;
            }
        }
    }
}
