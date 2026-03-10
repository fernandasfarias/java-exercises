// 2) List (Interface)

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args){
        List<Integer> numbers = new LinkedList<>();
        
        // adding numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // access a number
        numbers.get(0);

        // verify the size of the list
        numbers.remove(1);

        // verify if exists
        System.out.println(numbers.contains(60));

        for (Integer number : numbers){
            System.out.println(number);
        }
    }
}
