import java.util.ArrayList;

public class even{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        int count = 0;
        nums.add(23);
        nums.add(41);
        nums.add(32);
        nums.add(50);
        nums.add(68);
        nums.add(74);
        nums.add(99);

        System.out.println("Numbers: " + nums);
        System.out.println();

        for(int num : nums){
            if(num % 2 ==0){
                count++;
            }
        }

        System.out.println("Total even numbers: " + count);
    }
}