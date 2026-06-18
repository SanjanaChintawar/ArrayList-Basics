import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // how to take user input in ArrayList

        System.err.println("Enter the length of your list: ");
        int n = sc.nextInt();

        System.err.println("Enter numbers: ");
        for(int i = 0; i < n; i++){
            numbers.add(sc.nextInt());
        }
        System.err.println();
        System.err.println("List: "+ numbers);

        System.err.println("Maximum: "+ Collections.max(numbers));
        System.err.println("Minimum: "+ Collections.min(numbers));


    }
}
