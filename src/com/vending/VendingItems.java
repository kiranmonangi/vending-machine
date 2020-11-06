package com.vending;

public class VendingItems {
    public String itemname;
    public int price,quantity;

    public VendingItems(){

    }
    public VendingItems(String itemname,int price,int quantity){
        super();
        this.itemname=itemname;
        this.price=price;
        this.quantity=quantity;

    }

    @Override
    public String toString() {
        return "vending items[item name="+itemname+"  price="+price+ "  quantity:"+quantity+"]";
    }
}

