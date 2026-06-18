import java.util.ArrayList;

public class moreMethods {
    public static void main(String[] args){
        ArrayList<Character> alpha = new ArrayList<>();

        alpha.add('A');
        alpha.add('B');
        alpha.add('C');
        alpha.add('D');
        alpha.add('E');

        System.err.println(alpha);
        System.err.println();

        // contains method
        System.err.println("Is F Alphabet exists in List: "+ alpha.contains('F'));
        System.err.println();

        // indexOf method
        System.err.println("Index of D: " + alpha.indexOf('D'));
        System.err.println();

        // isEmpty method
        System.err.println("Is this list Empty: " + alpha.isEmpty());
        System.err.println();

        // for each loop
        System.err.println("Print all elements using for each loop: ");
        for(char a : alpha){
            System.err.println(a);
        }
        System.err.println();

        // clear( ) method
        alpha.clear();
        System.err.println("After clear method: "+ alpha);


    }
}
