package s1;
import java.util.*;

public class sample3 {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(0, "four");
        for(int i=0; i<map.size(); i++){
            System.out.println(map.get(i));
        }
        System.out.println();
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            System.out.println(map.get(key));
        }
        System.out.println();
        Collection<String> values = map.values();
        for(String value : values){
            System.out.println(value);
        }
    }
}
