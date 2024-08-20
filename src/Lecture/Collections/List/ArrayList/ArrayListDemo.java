package Lecture.Collections.List.ArrayList;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arl=new ArrayList<String>();
        arl.add("apple");
        arl.add("guava");
        arl.add("Grapes");
        arl.add("Banana");
        arl.add("Mango");
        System.out.println("Array list values: "+arl);
        arl.remove("guava");
        System.out.println("After remove Guava: "+arl);
        arl.remove(2);
        System.out.println("After Remove 2nd position: "+arl);
        System.out.println("Size of an arrayList: "+arl.size());
        System.out.println("Elements in array list:");
        Iterator it=arl.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
