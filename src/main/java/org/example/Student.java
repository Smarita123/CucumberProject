package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String fName, lName,email, city;
    private String standard;

    public Student(String fName, String lName, String email, String city, String standard) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.city = city;
        this.standard = standard;
    }


    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard){
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", standard=" + standard +
                '}';
    }

    public String createStudent(String fName, String lName, String email, String city, String standard) {

        Student student = new Student();
        String message=student.isNull( fName,  lName,  email,  city, standard);
        if(message.equals("NOT Registered")){
            return message;
        }
            else{
                student = new Student( fName,  lName,  email,  city, standard);
                message="Registration Successful";
                System.out.println(message);
        }

        return(message);

    }
    public String isNull(String fName, String lName, String email, String city, String standard){

        ArrayList alist = new ArrayList();
        alist.add(fName);
        alist.add(lName);
        alist.add(email);
        alist.add(city);
        alist.add(standard);
        for (int i=0; i<= alist.size();i++){
            if (null==(alist.get(i))){
                return "NOT Registered";
            }
                else return null;
        }
        return null;



    }
    public static void main(String args[]){

        Student obj=new Student();
        System.out.println( obj. createStudent("Smarita","Pattnaik","test@domain.com","Bhubaneswar","10"));

    }

    public  Student() {

    }

}











