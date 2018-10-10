package com.company;
import java.util.*;
import java.util.Scanner;
/* get input from user
get the length of the word
print it out
 */

public class Main {
    static String word = " ";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a word");
        word = sc.nextLine();
       int a = calculateLength();
       System.out.println(a);
        }
        public static int calculateLength(){
        int z = word.length();
        return z;
        }
}
