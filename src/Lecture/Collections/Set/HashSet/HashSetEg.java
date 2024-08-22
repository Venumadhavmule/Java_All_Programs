package Lecture.Collections.Set.HashSet;
/*
Hashset class:
It stores objects (elements) like an array but it grows in memory dynamically.it does not  store dupilicate data .. it permits null values to be stored.
1.To create a hashset
Hashset <E> hs= new  Hashset <E>();//default capacity 16.
Hashset <E> hs = new  Hashset <E>(int n);(hs initial capacity)
2.To add an element to hashset ,if it is not already present .
hs.add (element)
3. To remove an element from hashset.
 hs.remove (element)
The above the method returns Boolean value .
4.To remove all elements .
 hs .clear();
5.To know the no of elements in hashset.
Int n= hs.size();
 */
import java.io.*;
import java.util.*;
public class HashSetEg {
    public static void main(String[] args)throws IOException {
        HashSet<Integer> hs=new HashSet<Integer>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n value: ");
        int n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            System.out.print("Enter "+i+" integer value: ");
            int a=Integer.parseInt(br.readLine());
            hs.add(a);
            al.add(a);
        }
        System.out.println("HashSet values "+hs);
        System.out.println("ArrayList values "+al);
    }
}
