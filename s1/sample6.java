package s1;
import java.util.function.Function;

class MyFunc implements Function<String,String>{
    public String apply(String str){
        return "Hello "+str;  
    }
}

public class sample6 {
    public static void main(String[] args){
        MyFunc f = new MyFunc();
        String str = f.apply("World");
        System.out.println(str);
    }
}
