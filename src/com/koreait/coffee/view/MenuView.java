package com.koreait.coffee.view;

import com.koreait.coffee.controller.CategoryController;
import com.koreait.coffee.controller.DishController;
import com.koreait.coffee.controller.ShoppingCartController;
import com.koreait.coffee.model.dto.*;

import java.util.List;
import java.util.Scanner;

public class MenuView {
    public OrderView orderView = new OrderView();
    public Scanner sc = new Scanner(System.in);
    public ShoppingCartController shoppingCartController = new ShoppingCartController();
    public CategoryController categoryController = new CategoryController();
    public DishController dishController = new DishController();
    public void categoryView(Type type){
        while (true){
            for (Category category : categoryController.getAllCategory()) {
                System.out.println(category.getId() + ":" + category.getName());
            }
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
            List<Dish> dishesByCategoryId = dishController.getDishesByCategoryId(categoryId);
//            System.out.println("1.아메리카노   2.바닐라라떼   3.카페라떼   4.카페모카");
            for (Dish dish : dishesByCategoryId) {
                System.out.println(dish.getId() + ":" + dish.getName());
            }


            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    Temperature temperature = orderView.temperatureView();
                    Shot shot = orderView.shotView();
                    Dish dish = dishController.getDishById(choose);
                    dish.setShot(shot);
                    dish.setTemperature(temperature);
                    dishController.addDishFlavor(dish);
                    ShoppingCart shoppingCart = new ShoppingCart();
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
