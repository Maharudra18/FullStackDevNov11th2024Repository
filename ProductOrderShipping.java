package com.noargsconstructor;

class Product{
    int id;
    String Name;
    String Category;
    int stockquantity;
    float rating;
    {

        id=9;
        Name="Laptop";
        Category="Electronics";
        stockquantity=100;
        rating=4.5f;
        System.out.println("ID:"+id);
        System.out.println("Name:"+Name);
        System.out.println("Category:"+Category);
        System.out.println("Stock In Quantity:"+stockquantity);
        System.out.println("Rating:"+rating);
        System.out.println("++++++++++");
    }
}

class Order{
    int orderid;
    int customerid;
    String shippingAddress;
    String paymentstatus;
    String orderstatus;
    {
        orderid=66;
        customerid=10;
        shippingAddress="Koppal Near Bus Stand";
        paymentstatus="Succes";
        orderstatus="pending";
        System.out.println("Order Id :"+orderid);
        System.out.println("Customer ID:"+customerid);
        System.out.println("Payment Status:"+paymentstatus);
        System.out.println("Order Status:"+orderstatus);
        System.out.println("+++++++++++++");
    }
}

class Shipping{
    int shippingid;
    int orderid;
    String shippingAddress;
    String deilverystatus;
    float shippingcost;
    {

        shippingid=21;
        orderid=61;
        shippingAddress="Koppal Near Bus Stand";
        deilverystatus="Pending";
        shippingcost=123.56f;
        System.out.println("Shipping ID:"+shippingid);
        System.out.println("order ID:"+orderid);
        System.out.println("Shipping Address:"+shippingAddress);
        System.out.println("Deilvery Status:"+deilverystatus);
        System.out.println("Shipping Cost;"+shippingcost);
    }
}

public class ProductOrderShipping {
    public static void main(String[] args) {
        Product suma=new Product();
        Order   suma1=new Order();
        Shipping suma3=new Shipping();

    }
}
