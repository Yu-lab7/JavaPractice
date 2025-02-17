package s1;
import java.util.function.*;

public class sample10 {
    public static void main(String[] args){
        foo(() -> 10);
    }
    public static void foo(Supplier<Integer> supplier){
        System.out.println(supplier.get());
    }
}
