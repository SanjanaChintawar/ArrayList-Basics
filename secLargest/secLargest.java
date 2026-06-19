import java.util.ArrayList;
import java.util.Collections;

public class secLargest {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(22);                   
        list.add(32);                   
        list.add(45);                   
        list.add(67);                   
        list.add(43);                   
        list.add(72);                   
        list.add(72);                   
        Collections.sort(list);
        Collections.reverse(list);
        int Largest = list.get(0);
        int secLargest = -1;

        for(int num : list){
            if(num != Largest){
                secLargest = num;
                break;
            }
        }

        System.err.println(secLargest);

    } 
}
