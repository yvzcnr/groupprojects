package secondGroupExercises;

//2. Reverse a String: Write a function to reverse a given string. For
//example, given the input "Hello", the output should be "olleH".
public class Question2 {
    public static void main(String[] args) {
        /*String str1="yavuz";
        System.out.println("before:"+str1);
        String reversed="";
        for (int i=str1.length()-1;i>=0;i--){

            reversed+= str1.charAt(i);
        }
        System.out.println("after str1:"+reversed);*/
        System.out.println("before :yavuz");
        StringBuilder stringBuilder=new StringBuilder("yavuz");
        stringBuilder.reverse();
        System.out.println("after :"+ stringBuilder);

}}
