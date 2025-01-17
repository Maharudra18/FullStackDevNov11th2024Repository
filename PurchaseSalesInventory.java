package com.noargsconstructor;

class Purchase {
    int customerid;
    int productid;
    int quantity;
    String productName;
    String paymentmethod;
    {
        customerid = 10;
        productid = 112;
        quantity = 20;
        productName = "Speakers";
        paymentmethod = "Cash";
        System.out.println("Customer ID :" + customerid);
        System.out.println("Product ID:" + productid);
        System.out.println("Quantity :" + quantity);
        System.out.println("Product Name :" + productName);
        System.out.println("Payment Method :" + paymentmethod);
        System.out.println("++++++++++++");
    }

}
class Sales{
    int salesid;
    int customerid;
    int productid;
    String paymentstatus;
    String deilverymethod;
    {
        salesid=2;
        customerid=10;
        productid=112;
        paymentstatus="Succes";
        deilverymethod="Express";
        System.out.println("Sales ID :"+salesid);
        System.out.println("Customer ID :"+customerid);
        System.out.println("Product ID :"+productid);
        System.out.println("Payment Status :"+paymentstatus);
        System.out.println("Deilvery Method :"+deilverymethod);
        System.out.println("++++++++++++++");
    }
}


class Inventory {
    int itemid;
    String category;
    int quantityinstock;
    String supplierName;
    String status;

    {
        itemid = 7;
        category = "Electronics";
        quantityinstock = 345;
        supplierName = "Vikrant";
        status = "Deilverd";
        System.out.println("Itemd ID :" + itemid);
        System.out.println("Category :" + category);
        System.out.println("Quantity In Stock:" + quantityinstock);
        System.out.println("Supplier Name :" + supplierName);
        System.out.println("Status:" + status);
        System.out.println("++++++++++++++");

    }
}

public class PurchaseSalesInventory {
    public static void main(String[] args) {
        Purchase Appu=new Purchase();
        Sales obj=new Sales();
        Inventory obj1=new Inventory();

    }
}
