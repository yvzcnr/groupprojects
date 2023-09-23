package secondGroupExercises;

import com.sun.tools.javac.Main;

//1. Write a program to swap 2 String without a temporary variable?
public class Question1 {
    public static void main(String[] args) {
        String str1="yavuz";
        System.out.println("before str1:"+str1);
        String str2="cinar";
        System.out.println("before str2:"+str2);
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());
        System.out.println("after str1:"+str1);
        System.out.println("after str2:"+str2);

}}
