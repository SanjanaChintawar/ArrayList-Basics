import java.util.ArrayList;

public class methods {
    public static void main(String[] args){
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("pink");

        System.err.println(colors);

        // Size method 
        System.err.println(colors.size()); 

        // get method
        System.err.println(colors.get(2));

        // set method
        colors.set(2, "Orange");
        System.err.println("After set method: " + colors);

        // remove method
        colors.remove(3);
        System.err.println(colors + " Yellow removed");

        colors.add("Sky Blue");
        colors.add("White");

        // Traversing the arrayList
        System.err.println("Traverse the ArrayList: ");
        for(int i = 0; i < colors.size(); i++){
            System.err.println(colors.get(i));
        }


    }
}
