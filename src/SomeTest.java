import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SomeTest {

    public static void main(String args){
        Map<String,Integer> s = new HashMap<>();
        s.put("A",1);
        s.put("A",2);
        System.out.println(s.get("A"));
    }
}
