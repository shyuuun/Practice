package com.company.practice;
import java.util.Scanner;
public class PlusMinus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pos = 0, neg = 0, zero = 0;

        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
            if(arr[i] > 0)
                pos++;
            else if(arr[i] < 0)
                neg++;
            else
                zero++;
        }

        System.out.printf("%6f\n", (float)pos / arr.length);
        System.out.printf("%6f\n", (float)neg / arr.length);
        System.out.printf("%6f\n", (float)zero / arr.length);
    }
}
