package com.gentech.Inheritence;
class Employee
{
    void getname(String name,int sal)
    {
        System.out.println("Employee name is:" + name);
        System.out.println("Employee salary is:" + sal);
    }
}

class Manager extends Employee
{
    void setname(String name,int sal,double phonenumbers)
    {
        System.out.println("Manager name is:" + name);
        System.out.println("Manager Salary is" + sal);
        System.out.println("Manager Phonenumber is:" + phonenumbers);
    }
}

class Developer extends Employee
{
    void getdeveloper(String programinglangauge)
    {

        System.out.println("Programing Language is:" + programinglangauge);
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        Developer nandu=new Developer();
        nandu.getname("Shreyas",12000);
        nandu.getdeveloper("Java");
        Manager shivu=new Manager();
        shivu.getname("Shreyas",12000);
        shivu.setname("Manoj",30000,987654587);


    }
}
