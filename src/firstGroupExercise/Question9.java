package firstGroupExercise;


import java.util.Arrays;

// Write a java program to find the second largest number in the array?
public class Question9 {
    public static void main(String[] args) {
        int [] numbers={15,64,45,78,23,0,12};
        int  maxNumber=numbers[0];
        int secondNumber=numbers[1];
        for (int i:numbers){
            if(i>maxNumber){
                secondNumber=maxNumber;
                maxNumber=i;}
            else if (i>secondNumber&&i<maxNumber) {
                secondNumber=i;
            }
        }
        System.out.println("second number :"+secondNumber);

    }}

