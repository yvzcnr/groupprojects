package secondGroupExercises;
//Count the Number of Words in a String: Write a function to count the
//number of words in a given string. Words are separated by spaces or
//punctuation. For example, the input "Hello, world!" should return 2.
public class Question4 {
    public static void main(String[] args) {
        String sentence="Hello, world! hi,hi";
        String [] str=sentence.split("\\s+|\\p{Punct}+");
        int count = 0;
        for (String word : str) {
            if (!word.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
