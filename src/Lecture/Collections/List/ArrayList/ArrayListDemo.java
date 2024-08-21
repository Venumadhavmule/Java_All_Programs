package Lecture.Collections.List.ArrayList;
/*
ArrayList class:
-----> ArrayList Is not Synchronised.
------> Vector is Synchronised.
Array list is similar to an array but it grows dynamically in memory . It is not synchronized.
   ( when the multiple threads are acting will give the wrong result)
1.To create an arraylist
 ArrayList <E>  arl = new ArrayList <E>();
ArrayList  <E> arl =new ArrayList <E>( int n ) ;// n= initial capacity
2. To add the objects ,use add () method
 arl.add (element);
To above method returns Boolean value
arl. add  ( n, element);
The above method returns void .
3.To remove a particular element from the array list .
arl. remove(element);
The above method returns Boolean value .
To remove element at nth position .
element = arl . remove (n);
4.To remove all of the elements from the arraylist
arl . clear ();
This method return void
5. to return element at nth position .
 element = arl. get(n) ;
6. To  know  no of objects in the array list ,use size()
Int n = arl .size ();
7.To convert arraylist into an array ,use to array()
 object x[ ] = arl.toarray ();
 */
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arl=new ArrayList<String>();
        arl.add("apple");
        arl.add("guava");
        arl.add("Grapes");
        System.out.println(arl.isEmpty());
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
        arl.clear();
        System.out.println("ArrayList values : "+arl);
    }
}
