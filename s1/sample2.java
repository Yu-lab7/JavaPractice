package s1;
import java.util.*;

public class sample2 {
    public static void main(String[] args){
        String[] ary = {"CCC", "AAA", "BBB"};
        HashSet<String> set = new HashSet<>();
        set.add(ary[0]);
        set.add(ary[1]);
        set.add(ary[2]);

        System.out.println("size:" + set.size());
        for (String s : set) {
            System.out.println(s);
        }
    } 
}
