package s1;
import java.util.function.*;

public class sample8 {
    public static void main(String[] args){
        Function<String,String> obj = (str) -> {
            return "Hello "+str;
        };
        String str = obj.apply("World");
        System.out.println(str);
    }
}