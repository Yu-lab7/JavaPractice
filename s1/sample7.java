package s1;
import java.util.function.*;

public class sample7 {
    public static void main(String[] args){
        String str = new Function<String,String>(){
            public String apply(String str){
                return "Hello "+str;  
            }
        }.apply("World");
        System.out.println(str);
    }
}
