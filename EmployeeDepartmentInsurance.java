package com.noargsconstructor;

class Employee {
    String FirstName;
    String LastName;
    int id;
    double sal;
    String position;

    {
        FirstName = "Nandu";
        LastName = "Nagarur";
        id = 1;
        sal = 20000;
        position = "Manager";
        System.out.println("First Name;" + FirstName);
        System.out.println("Last Name:" + LastName);
        System.out.println("ID:" + id);
        System.out.println("Sal:" + sal);
        System.out.println("position:" + position);
        System.out.println("++++++++++++");
    }
}
class Department{
    String Name;
    int id;
    String location;
    String manager;
    float budget;
    {
         Name="Developer";
         id=2;
         location="Banglore";
         manager="jhon";
         budget=5000.0f;
        System.out.println("Name:"+Name);
        System.out.println("ID:"+id);
        System.out.println("Location:"+location);
        System.out.println("manager:"+manager);
        System.out.println("Budget:"+budget);
        System.out.println("+++++++++++");
    }
}

class Insurance{
    int id;
    String type;
    float covargeAmount;
    float premiumAmount;
    String status;
    {
        id=3;
        type="Health";
        covargeAmount=5000.0f;
        premiumAmount=4500.0f;
        status="Active";
        System.out.println("ID:"+id);
        System.out.println("Type:"+type);
        System.out.println("Covarge Amount:"+covargeAmount);
        System.out.println("Premium Amount:"+premiumAmount);
        System.out.println("Status:"+status);

    }
}







public class EmployeeDepartmentInsurance {
    public static void main(String[] args) {
        Employee santu=new Employee();
        Department obj=new Department();
        Insurance nandu=new Insurance();

    }
}


