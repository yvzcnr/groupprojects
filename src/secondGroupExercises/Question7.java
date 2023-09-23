package secondGroupExercises;
//You have a list of strings and you want to keep only those that start
//with “A” and you want to return them in lower case"
public class Question7 {
    public static void main(String[] args) {
        String sentences="WHAT A FLAVOR APPLE";
        System.out.println(sentences);
        String [] sentences1=sentences.split(" ");
        for (String word:sentences1){
            if (word.startsWith("A")){
                System.out.println(word.toLowerCase());
            }
        }
    }
}
