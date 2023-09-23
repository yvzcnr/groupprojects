// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {

        String str ="abracadabra";

        for(char i :str.toCharArray()){
            if ( str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }
}
