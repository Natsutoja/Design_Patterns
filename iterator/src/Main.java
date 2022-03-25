import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(55);
        numbers.add(23);
        numbers.add(1);
        numbers.add(10);
        numbers.add(2);
        numbers.add(241);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext())
        {
            Integer x = it.next();
            if(x < 15) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}