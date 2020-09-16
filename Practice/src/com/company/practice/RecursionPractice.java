package com.company.practice;
import java.util.Scanner;
public class RecursionPractice {
    public static int summation(int x){
        //base case
        if(x < 0){
            return 0;
        }
        //recursive case
        else{
            return x + summation(x-1);
        }
    }
    public static int factorial(int x){
        //base
        if(x < 1){
            return 1;
        }
        //recursive
        else{
            return x * factorial(x - 1);
        }
    }
    public static int exponent(int x, int y){
        //base
        if(y == 0){
            return 1;
        }
        //recursive
        else{
            return x * exponent(x, y - 1);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        System.out.println("Summation: "+ summation(firstNum));
        System.out.println("Factorial: "+ factorial(firstNum));
        System.out.println("Exponent: "+ exponent(firstNum, secondNum));
    }
}
