package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {
    Customer customer;

    ArrayList customerList;

    String name, place, company;;

    public String getCompany(String name, String place) {
        for (int i=0;i<=customerList.size()-1;i++){
            customer= (Customer) customerList.get(i);
            if (name.equals(customer.name) && place.equals(customer.place)) {
                System.out.println(customer.company);
                return customer.company;
            }else {}

        }
        return customer.company;
    }

    public Customer(String name, String place, String company){
        this.name=name;
        this.place=place;
        this.company=company;
    }
    public Customer(){

    }
    public ArrayList createCustomer(){
        customerList= new ArrayList<Customer>();
        Customer customer1= new Customer("Lalatendu", "Bhubaneswar", "TechM");
        Customer customer2= new Customer("Smarita", "Mumbai", "Paymentz");
        customerList.add(customer1);
        customerList.add(customer2);
        return customerList;


    }
    public static void main(String[] args){

        Customer customer= new Customer();
        customer.createCustomer();
        customer.getCompany("Smarita","Mumbai");

    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
