package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class L2942 {
        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> a = new ArrayList<>();
            for(int i=0 ; i< words.length;i++){
                if(words[i].indexOf(x) != -1){
                    a.add(i);
                }
            }
            return a;
        }
}
