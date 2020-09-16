package com.company.practice;
import java.util.Scanner;
public class StringPalindrome {

    private static void palindrome(String s){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        if(reverse.equals(s))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string to check if this is palindrome");
        String a = input.next();

        palindrome(a);


    }
}
