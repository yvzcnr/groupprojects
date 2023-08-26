package firstGroupExercise;
//Create a 2D array or integer type where you will store odd and even
//numbers. Develop a program which will identify/print the even
//numbers only.
public class Question3 {
    public static void main(String[] args) {
        int [][] numbers={{15,20,25,39},
                          {40,41,52,61},
                          {65,67,70,72},};

        for (int row=0;row< numbers.length;row++){
            for (int col=0; col< numbers[row].length;col++){
                if (numbers[row][col]%2==0){
                    System.out.print(numbers[row][col]+" ");
                }

            }System.out.println();
        }

    }
}


