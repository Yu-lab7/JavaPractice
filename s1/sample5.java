package s1;
import java.util.*; 

public class sample5{
    public static void main(String[] args){
        String[] ary = {"A","B","C","D","E"};
        List<String> list = Arrays.asList(ary);
        list.set(2,"D");
        for(String s : list){
            System.out.println(s);
        }
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {6,7,8,9,10};
        System.out.println("compare: "+ Arrays.compare(nums1,nums2));
        System.out.println("mismatch: "+ Arrays.mismatch(nums1,nums2));
    }
}