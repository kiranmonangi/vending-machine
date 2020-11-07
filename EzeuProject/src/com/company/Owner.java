package com.company;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;


public class Owner {


    static ArrayList<VendingItems> item_list = new ArrayList<>();
    static String item;
    static int choice, price, quantity;
    static VendingItems v = new VendingItems();
    static VendingItems vi = new VendingItems();
    static VendingItems vi2 = new VendingItems();
    static VendingItems vi3 = new VendingItems();
    static Owner ow = new Owner();

    public Owner() {
        vi = new VendingItems("burger", 20, 3);
        vi2 = new VendingItems("pizza", 30, 5);
        vi3 = new VendingItems("samosa", 40, 6);
        item_list.add(vi);
        item_list.add(vi2);
        item_list.add(vi3);
    }

    //static Scanner sc;
    public static void main(String[] kiran) {
        do {
            System.out.println("Owner---1\t\t\t\t\tCustomer------2");
            Scanner sc = new Scanner(System.in);
            int cc = sc.nextInt();
            if (cc == 1) {
                System.out.println("enter password for owner:");
                int password = sc.nextInt();

                if (password == 1234) {
                    System.out.println("hello......Owner.............");


                    do {

                        System.out.println("1.add item \t 2.remove item \t 3 display item \t 4 exit fom output \t 5 goto home:");
                        System.out.println("enter ur choice");
                        //   Scanner sc = new Scanner(System.in);
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {


                                add_item();
                                break;
                            }
                            case 2 -> {
                                delete_item();
                                break;
                            }
                            case 3 -> {
                                display_item();
                                break;
                            }
                            case 4 -> {
                                exit(0);
                                break;
                            }

                            default -> {
                                System.out.println("enter proper choice:");
                                break;
                            }

                        }
                    } while (choice<5);
                } else {
                    exit(0);
                }
            }


            if (cc == 2) {
                System.out.println("hello customer...........");
              //  Owner ow = new Owner();
                display_item();
                System.out.println("choose item by giving its index:");
                int itm = sc.nextInt();
                VendingItems vii = new VendingItems();
                vii = item_list.get(itm);
                System.out.println("ur selected item is:" + vii.itemname + "\tprice:" + vii.price);

                System.out.println("how many  "+vii.itemname+ "  do u want:");
                int qua = sc.nextInt();
                if (qua> vii.quantity){
                    System.out.println("we dont have that plenty of  "+vii.itemname+ " please enter the required quantity:");
                    qua =sc.nextInt();

                }

                int cost = vii.price * qua;
                System.out.println("enter amount:" + cost);
                int bill = sc.nextInt();
                if (bill < cost) {
                    System.out.println("u have low balance");
                } else if (bill > cost) {
                    int rembal = bill - cost;
                    System.out.println("take change:" + rembal);
                } else {
                    System.out.println("take it  " + vii.itemname);
                }
                vii.quantity= vii.quantity-qua;
                if (vii.quantity<=0){
                    item_list.remove(itm);
                }

            }

        } while (true);

    }

    public static void add_item() {

        //  System.out.println("adding item");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the item u have to add:");
        item = sc.nextLine();
        System.out.println("enter price for that:");
        price = sc.nextInt();
        System.out.println("quantity to that:");
        quantity = sc.nextInt();
        vi = new VendingItems(item, price, quantity);
        item_list.add(vi);
        System.out.println("item added to the machine");
    }

    public static void delete_item() {

        System.out.println("enter the index  u have to delete");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        item_list.remove(num);
        System.out.println("u deleted the item");
    }

    public static void display_item() {
        System.out.println("items are");
        int k=0;
        for (VendingItems vv : item_list) {

            System.out.println(k +"  "+vv);
            k=k+1;
        }


    }
}


