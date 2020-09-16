package com.company.practice;
import java.util.Scanner;
public class SubStringPractice {
    public static void main(String[ ]args){
        Scanner input = new Scanner(System.in);

        String data = input.next(); //insert string e.g. Hello World
        int start = input.nextInt(); //insert number where to start
        int last = input.nextInt(); //insert number to end -1 of the string

        String result = data.substring(start, last);

        System.out.println(result);

    }

}
