package firstGroupExercise;
//Create an array of integer values. After the array is created, calculate
//the sum of all stored elements in that array.
public class Question2 {
    public static void main(String[] args) {
        int [][] numbers={{15,20,25},
                {40,41,52},
                {65,67,70},};
        int sum=0;
        for (int row=0;row< numbers.length;row++){
            for (int col=0; col< numbers[row].length;col++){
                sum=sum+numbers[row][col];

            }
        }System.out.println("sum of all stored element :"+sum);

    }
}
