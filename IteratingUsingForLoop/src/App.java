import java.util.ArrayList;
import java.util.List;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        List <Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
        
             
            for (int i = 0; i < list.size(); i++) { //Simple for loop
              System.out.println(list.get(i));
            }
        
            for (Integer i : list) {   //Enhanced for loop
              System.out.println(i);
            }
    }
}
