package s1;
import java.util.*;
import java.util.function.*;

public class sample9 {
    public static void main(String[] args){
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        data.removeIf((Integer i) -> {return i%2==0;});
        System.out.println(data);

        List<String> words = Arrays.asList("Tanaka","Sato");
        words.replaceAll((String s) -> {return s.toUpperCase();});
        System.out.println(words);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.sort((Integer o1, Integer o2) -> {return o1.compareTo(o2);});
        System.out.println(list);

        List<Integer> lists = Arrays.asList(20,30,10);
        lists.forEach((Integer num) -> {System.out.println(num);});
    }
}
