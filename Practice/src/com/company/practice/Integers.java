package com.company.practice;
import java.util.Scanner;
public class Integers {

    public static void main(String[] args){
        int result = 0;
        Scanner input = new Scanner(System.in);
        //n = digits
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            int temp = input.nextInt();
            //check if the number is negative
            if(temp < 0) {
                temp *= -1; //main problem. i used math.abs method but it didn't work so i multiply by -1
            }
            arr[i] += temp;
            result += arr[i];
        }

        System.out.println(result);

    

    }

}
