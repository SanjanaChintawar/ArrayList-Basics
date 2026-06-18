import java.util.ArrayList;
import java.util.Collections;

public class sortReverse {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(30);
        nums.add(50);
        nums.add(40);
        nums.add(10);
        nums.add(30);
        nums.add(40);

        System.err.println(nums);
        System.err.println();

        // sort nums
        Collections.sort(nums);
        System.err.println("Sorted nums: "+nums);

        // reverse nums
        System.out.println();
        Collections.reverse(nums);
        System.out.println("Reverse nums: " +  nums);

        
    }
}
