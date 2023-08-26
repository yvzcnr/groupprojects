package firstGroupExercise;

import java.util.Scanner;

//Write a java program to check whether a given number is prime or
//not?
public class Question6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("please enter a number :");
        int num=scanner.nextInt();
        if(num==0 || num==1||num<1){
            System.out.println("this is not prime");
        return;}
        if (num==2){
            System.out.println("this is prime");
        return;}
        if(num%2==0){
            System.out.println("this is not prime");
        }else{
            System.out.println("this is prime");
        }



    }
}
