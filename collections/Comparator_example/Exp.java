
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javafx.util.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Exp {
    public static void main(String args[]){
        
        List<Pair<String, Integer>> words = new ArrayList<Pair<String, Integer>>();
        words.add(new Pair<String, Integer>("hello",2));
        words.add(new Pair<String, Integer>("hello",6));
        words.add(new Pair<String, Integer>("aello",6));

        
        words.sort(new Comparator<Pair<String, Integer>>() {
            @Override
            public int compare(Pair<String, Integer> o1, Pair<String, Integer> o2) {
                if (o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() == o2.getValue()) {
                    if(o1.getKey().compareTo(o2.getKey()) > 0) {
                        return 1;
                    }
                    else return -1;
                } else {
                    return 1;
                }
            }
        });

        System.out.println(words);
        
    }
}
