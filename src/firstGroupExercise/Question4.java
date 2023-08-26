package firstGroupExercise;
// Create a 2D array of integers. Develop a program which will calculate
//the sum of even and odd numbers for that array.
public class Question4 {
    public static void main(String[] args) {
        int [][] numbers={{15,20,25,39},
                          {40,41,52,61},
                          {65,67,70,72},};
        int sumEven=0;
        int sumOdd=0;
        for (int row=0;row< numbers.length;row++){
            for (int col=0; col< numbers[row].length;col++){
                if (numbers[row][col]%2==0){
                    System.out.print(numbers[row][col]+" ");
                sumEven=sumEven+numbers[row][col];}

                 if (numbers[row][col]%2!=0) {
                    System.out.print(numbers[row][col]+" ");
                    sumOdd=sumOdd+numbers[row][col];}

            }System.out.println();
        }
        System.out.println("total of even number: "+sumEven);
        System.out.println("total of odd number: "+sumOdd);
    }
}
