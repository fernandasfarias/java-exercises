// 1) Array List -> array dinâmico

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<String> tasks = new ArrayList<>();
        
        // add elements
        tasks.add("Study Java");
        tasks.add("Go to the gym");
        tasks.add("Read a book");

        // access elements
        System.out.println(tasks.get(0));

        // size of the list
        System.out.println(tasks.size());

        // traverse list
        for(String task : tasks){
            System.out.println(task);
        }

        // remove element
        tasks.remove(1);

        for(String task : tasks){
            System.out.println(task);
        }
    }
}
