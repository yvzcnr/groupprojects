package firstGroupExercise;


import java.util.Arrays;
import java.util.Scanner;

// Maximum and minimum number in the array?
public class Question8 {
    public static void main(String[] args) {
        int [] numbers={15,20,36,5,65,7,6,0};

        for (int row=0;row< numbers.length;row++){
            System.out.print(numbers[row]+" ");
        }
        
        System.out.println();
        int  maxNumber=numbers[0];
        int minNumber=numbers[0];
        for (int i:numbers){
            if(i>maxNumber){
                maxNumber=i;}
            else if (i<minNumber) {
                minNumber=i;

            }

        }
        System.out.println("max number is :"+maxNumber);
        System.out.println("min number is :"+minNumber);
    }}

