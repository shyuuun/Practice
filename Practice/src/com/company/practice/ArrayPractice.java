package com.company.practice;
import java.util.Scanner;
public class ArrayPractice {

    //method table display for multi-dimensional arrays
    public static void display(int x[][]){
        for(int row = 0; row < x.length; row++){
            for(int column = 0; column < x[row].length; column++){
                System.out.print(x[row][column]+ "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        /*
        Calculate the sum of all arrays

        Scanner input = new Scanner(System.in);
        int result = 0;

        System.out.println("Input n");
        int n = input.nextInt();
        int[] intArray = new int[n];

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = input.nextInt();
            result+=intArray[i];
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println("Array index "+ i + ": "+ intArray[i]);
        }
        System.out.println("Result: "+result);

        END
         */



        //Multidimensional arrays

        int bucky[][] = {{1,2,3,4,5}, {6,7,8,9,10}};
        int buckyTwo[][] = {{11,12,13,14,15}, {16}, {17,18,19,20}};
        System.out.println("This is the first array");
        display(bucky);
        System.out.println("This is the second array");
        display(buckyTwo);



        

    }
}
