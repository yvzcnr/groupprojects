package secondGroupExercises;
//Check if a String is Palindrome: Determine whether a given string is
//a palindrome, which means it reads the same forwards and
//backward. For example, "madam" is a palindrome.
public class Question3 {
    public static void main(String[] args) {
        String word="madam";
        String reversed="";
        for (int i=word.length()-1;i>=0;i--){

            reversed+= word.charAt(i);}
            if (word.equals(reversed)){
                System.out.println("this is a palindrome word");
            }else {
                System.out.println("sorry!it is not a palindrome word");
            }


    }
}
