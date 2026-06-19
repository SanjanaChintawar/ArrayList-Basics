import java.util.ArrayList;

public class rotate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int k = 2;

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = list.size()-k; i < list.size(); i++){
            result.add(list.get(i));
        }
        for(int i = 0; i < list.size() - k; i++){
            result.add(list.get(i));
        }
        System.err.println(result);
    }
}
