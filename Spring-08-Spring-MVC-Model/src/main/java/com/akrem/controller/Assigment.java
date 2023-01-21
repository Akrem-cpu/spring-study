package com.akrem.controller;



import java.util.Arrays;
import java.util.Scanner;

public class Assigment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your required method number");
        System.out.println("1:-divisible By The SecondNumber. which gives you if the number is divisible by the second   ");
        System.out.println("2:-largest Number which gives you the largest out of 3 numbers");
        System.out.println("3:-userChoice which gives you 3 option to do with the number(NEGATE,SQUARE,FACTORIAL) ");
       int choice =  scan.nextInt();
        switch (choice){
            case 1 :
                System.out.println("please input your two numbers ");
                System.out.println(divisibleByTheSecondNumber(scan.nextInt(), scan.nextInt()));
                break;
            case 2:
                System.out.println("please give your 3 numbers");
                System.out.println(largestNumber(scan.nextInt(), scan.nextInt(), scan.nextInt()));
                break;
            case 3:
                System.out.println("Please the number and the action you want to be done for you");
                System.out.println(userChoice(scan.nextInt(),scan.next().toUpperCase()));
                break;
            default:
                System.out.println("Wrong input");
        }

    }


    public static String divisibleByTheSecondNumber(int x , int y){
        return x % y == 0 ? x+ " is Divisible by: "+y : x +" is Not divisible by: " + y;

    }
    public static int largestNumber(Integer... num){
        int temp = Integer.MIN_VALUE;
        for (int each : num) {
            if(each > temp ){
                temp = each;
            }
        }
        System.out.println("the largest number is");
        return temp;
    }
    /*
    if this method retrun 0 that means there is a user input error
     */
    public static int userChoice(Integer num, String userActionNeeded ){
        if(Arrays.stream(UserActionNeeded.values()).noneMatch(p-> p.toString().equalsIgnoreCase(userActionNeeded))){
            System.out.println("The Action your Required is not found " + userActionNeeded);
            return 0;
        }
        switch (UserActionNeeded.valueOf(userActionNeeded)){
            case NEGATE:
                System.out.println("This is the Negate number");
                return num* -1;
            case SQUARE:
                System.out.println("This is the Square number");
                return num*num;
            case FACTORIAL:
                if(num <= 0){
                    System.out.println("Factorial can not be 0 or negative");
                    return 0;
                }
                int temp = 1;
                for (int i = 2; i <= num ; i++) {
                    temp*= i;

                }
                System.out.println("This is the Factorial number");
                return temp;
        }
        System.out.println("The Action your Required is not found " + userActionNeeded);
        return 0;
    }


    enum UserActionNeeded{
        NEGATE,SQUARE,FACTORIAL
    }


}
