package com.company.practice;
import java.util.Scanner;

public class SubStringLexi {
    public static String getSmallestAndLargest(String s, int k){
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for(int i = 0; i <= s.length() - k; i++){
            String temp = s.substring(i, i + k);
                if(temp.compareTo(smallest) < 0)
                    smallest = temp;
                if(temp.compareTo(largest) > 0)
                    largest = temp;
        }

        return smallest + "\n" + largest;

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.next();
        input.nextLine();
        int k = input.nextInt();

        System.out.println(s);
        System.out.println(getSmallestAndLargest(s, k));


    }
}
