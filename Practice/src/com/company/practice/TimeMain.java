package com.company.practice;
import java.util.Scanner;
public class TimeMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Time timeObject = new Time();

        System.out.println("Enter hour");
        int hour = input.nextInt();
        System.out.println("Enter minutes");
        int minutes = input.nextInt();
        System.out.println("Enter seconds");
        int seconds = input.nextInt();

        Time timeObject2 = new Time(hour);
        Time timeObject3 = new Time(hour, minutes);
        Time timeObject4 = new Time(hour, minutes, seconds);

        //military time
        timeObject.setTime(hour, minutes, seconds);
        System.out.println("Object 1: "+timeObject.toMilitarize());
        System.out.println("Object 2: "+timeObject2.toMilitarize());
        System.out.println("Object 3: "+timeObject3.toMilitarize());
        System.out.println("Object 4: "+timeObject4.toMilitarize());

        System.out.println(timeObject.toStandard());





    }
}
