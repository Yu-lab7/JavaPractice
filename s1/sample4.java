package s1;
import java.util.*;

public class sample4 {
    public static void main(String[] args){
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(20);
        hSet.add(500);
        hSet.add(300);
        System.out.println(hSet);
        TreeSet<Integer> tSet = new TreeSet<>();
        tSet.add(20);
        tSet.add(500);
        tSet.add(300);
        System.out.println(tSet);
    }
}
