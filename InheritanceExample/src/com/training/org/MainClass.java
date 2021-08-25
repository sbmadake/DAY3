package com.training.org;

public class MainClass {
    public static void main(String[] args) {

//        Employee e1=new Employee();
//        System.out.println(e1);
        System.out.println("\n\n*********************  e2 ************************");
        Employee e2=new Employee(101,"Peter",10000,new FamilyDetails(4,"Mark","Anthony"),new Address("Maharashtra","Pune","ABC","TEMP-10002",411011));
        System.out.println(e2);
        System.out.println("\n\n*********************  e3 ************************");
        Employee e3=new Employee(102,"ABC",20000,4,"XYZ","PQR","Maharashtra","Mumbai","Bandra","A-2002",311023);
        e3.addNewAddress("TEMP STATE","TEMP CITY","TEMP AREA","TEMP BUILD",0000);
        System.out.println(e3);




//        System.out.println("**************  E1 ******************************* ");
//        Employee e1=new Employee();
//        System.out.println(e1);
//
//        System.out.println("**************  E2 ******************************* ");
//        Employee e2=new Employee(101,"Mark",10000,new FamilyDetails(4,"Peter","Anthony"));
//        System.out.println(e2);
//
//        System.out.println("**************  E3 ******************************* ");
//        Employee e3=new Employee(102,"Maria",40000,5,"ABC","XYZ");
//        System.out.println(e3);
//
//




//        SalesEmployee s1=new SalesEmployee(101,"Eshan",30455,15000);
//        s1.calculateSalary();
//        System.out.println(s1);
//

//        WageEmployee we1=new WageEmployee(101,"Anuj",10000,"Oct",2020,240);
//        System.out.println(we1);

//        Employee e1=new Employee();
//        System.out.println(e1);
//
//        Employee e4=new Employee(101,"Aman",10000);
//        System.out.println(e4);
    }
}
