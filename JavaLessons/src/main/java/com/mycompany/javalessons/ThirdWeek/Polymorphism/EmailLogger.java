package com.mycompany.javalessons.ThirdWeek.Polymorphism;

public class EmailLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println("Logged to Email = " + message);
    }    
}
