//package com.training.org;
//
//public class WageEmployee extends Employee{
//    private String month;
//    private int year;
//    private double noOfWorkingHours;
//    private double wages;
//
//    public WageEmployee(){
//        System.out.println("Default constructor of WageEmployee is called");
//        month="";
//        year=0;
//        noOfWorkingHours=0;
//        wages=0;
//    }
//
//    public WageEmployee(int empId,String name,double salary,String month, int year,int noOfWorkingHours) {
//        super(empId,name,salary);
//        System.out.println("Parameterised constructor of WageEmployee is called");
//        this.month = month;
//        this.year = year;
//        this.noOfWorkingHours = noOfWorkingHours;
//        this.wages = 0;
//    }
//
//    public void calculateSalary(){
//        System.out.println("Calculating of salary of WageEmployee is called");
//    }
//
//    @Override
//    public String toString() {
//        return super.toString()+"WageEmployee{" +
//                "month='" + month + '\'' +
//                ", year=" + year +
//                ", noOfWorkingHours=" + noOfWorkingHours +
//                ", wages=" + wages +
//                '}';
//    }
//}
//
