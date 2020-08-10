package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(returnMethod( 30, 34));
        System.out.println(returnMethod( 25, 22));
        System.out.println(returnMethod( 36, 32));
        System.out.println(returnMethod( 45, 34));
        System.out.println(returnMethod( 18, 345));
        System.out.println("случайный номера " + generateRandomAge());

    }

    public static String returnMethod(int age,int temperature){

        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)){
          return "Можно идти гулять";
        } else if (age < 20 && (temperature >= 0 || temperature < 28)){
          return "Можно идти гулять";
        } else if (age > 45 && (temperature >= -10 || temperature <= 25)){
          return "Можно идти гулять";
        } else{ return "Oставайтесь дома";
       }


    }
 public static int generateRandomAge(){
     int random  = (int)(Math.random()*((1 + 100)));

     return  random;

 }

}


