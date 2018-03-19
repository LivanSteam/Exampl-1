package application;

import java.util.ArrayList;

        
public class Application {

    public static void main(String[] args) {
        
        ArrayList<Integer> some_dyn = new ArrayList<>(4);
        
        some_dyn.add(634);
        some_dyn.add(324);
        some_dyn.add(8);
        some_dyn.add(432);
        some_dyn.add(754);
        
        for(Integer x : some_dyn){
            System.out.println(x);
        }
    }
}
