package com.vending;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("************WELCOME TO VENDING MACHINE*************");
        Main.snacks();
    }
    public static void quantityofitems(){
        System.out.println("enter quantity:");
        Scanner sc=new Scanner(System.in);
        int quantity = sc.nextInt();
        int price=quantity*100;
        System.out.println("cost is "+price+ " please enter the amount:");
        int amount = sc.nextInt();
        if(amount>price)
        {
            int balance=amount-price;
            System.out.println("please take the item");
            System.out.println("the remaining balance is "+balance);
        }
        else if(amount<price)
        {
            System.out.println("insufficent balance");
        }
        else
        {
            System.out.println("please take the item");
        }

    }
    public static void snacks() {
        System.out.println("SNO.\t\tITEM\t\tPRICE");
        System.out.println("1\t\tPIZZA\t\t100");
        System.out.println("2\t\tlays\t\t20");
        System.out.println("3\t\tburger\t\t50");
        System.out.println("what do you want to select\n");
        Scanner  sc = new Scanner(System.in);
        int item = sc.nextInt();

        switch(item)
        {
            case 1:
            {
                quantityofitems();
                break;
            }
            case 2:
            {
                quantityofitems();
                break;
            }
            case 3:
            {
                quantityofitems();
                break;
            }
        }
    }
}

