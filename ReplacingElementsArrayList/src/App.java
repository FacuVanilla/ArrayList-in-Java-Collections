import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            list.replaceAll((element) -> element.toUpperCase());
            System.out.println(list);
    }
}
