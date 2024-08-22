package Lecture.Collections.Map.HashTable;
import java.io.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Hashtable;

/*
Hashtable class:
It stores objects (elements)in the form of  keys and value pairs .it is possible to retrieve value depending on the key .it is synchronized .it does not permit null keys and  null values.
1.To create a hash table .
Hashtable<k,v>ht= new Hashtable <k,v>();//default
Capacity is 11.(if did not mention size then default capacity is 11).
Hashtable <k,v> ht= new Hashtable <k,v> (int n );(initial capacity)
2.To store key –value pair in hashtable.
  ht.put (key ,value);
3.To get the value when key is given .
 value=ht.get(key)
If the key does not exist ,then it returns null.
4.To remove the key(and its corresponding value)
ht.remove (key);
If the key does not exist ,then it returns null.
5.To remove all the key-value pairs.
ht.clear();
6.enumeration <k>keys()(it retrieve keys and store in enumeration obj)
Returns an enumeration of the keys in this hashtable .
7.collection<v> values ()
Returns a collection object that contains all the values .
It retrieves the values from values method and stores in collection class object .
8.To know the no of key –value pairs in the hashtable.
   Int n = ht.size();

 */
public class HashTableDemo {
    public static void main(String[] args) throws IOException{
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
        ht.put("sachin",77);
        ht.put("Dhoni",66);
        ht.put("Kohli",99);
        ht.put("yuvraj",33);
        ht.put("Sehwag",150);
        System.out.println("The player name are:");
        Enumeration e=ht.keys();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());
        System.out.println("The runs are: ");
        Collection<Integer> value=ht.values();
        for (int a:value){
            System.out.println(a);
        }
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter player name: ");
        String name=br.readLine();
        Integer score=ht.get(name);
        if(score==null){
            System.out.println("player not found ");
        }else{
            int sc=score.intValue();
            System.out.println(name+" has scored run="+sc);
        }
    }
}
