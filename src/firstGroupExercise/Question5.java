package firstGroupExercise;
// Write a program to swap 2 numbers without a temporary variable?
public class Question5 {
    public static void main(String[] args) {
        int a=12;
        int b=10;
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("swap a:"+a+" swap b:"+b);
    }
}
