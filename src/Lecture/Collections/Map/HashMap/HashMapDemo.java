package Lecture.Collections.Map.HashMap;
/*
Hashmap class:
It stores objects (elements) in the form of keys and value pairs.it is possible to retrieve value depending upon the key. It is not synchronized .it permits null keys and null values.
1.To create a hashmap
HashMap <k,v>hm= new HashMap <k,v>();//default capacity 16.
HashMap <k,v>hm= new HashMap <k,v>(int n);(initial capacity)
2.To store key-value pair in hashmap
hm.put (key,value);
3.To get the values when  key is given
 Value =hm.get (key);
If the key does not exist ,then it returns null .
4.to remove the key(  and its corresponding value)
hm.remove(key);
If the key doesnot exist , then it returns null.
5.to remove  all the key-value pairs from the hashmap
hm.
6.collection <v>values ()clear();
Returns a collection object that contains all the values
7.To know the no of key values pair in the hashmap
 Int n= hm.size ();

 */
import java.io.*;
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        HashMap<String, Long> hm = new HashMap<String, Long>();
        System.out.println("HashMap data: "+hm);
        String name, str;
        Long phno;
        while (true) {
            System.out.println("Enter your choice from the below:");
            System.out.println("1.Store telephone entries");
            System.out.println("2.Lookup for a phone number");
            System.out.println("3.For display Hashmap Data");
            System.out.println("4.For remove value through key ");
            System.out.println("5.For remove all Key-values ");
            System.out.println("6.For know the size of hashmap. ");
            System.out.println("7.Exit");
            int n = Integer.parseInt(br.readLine());
            switch (n){
                case 1:
                    System.out.println("You are trying to Store phoneNumber");
                    System.out.print("Enter Name: ");
                    name=br.readLine();
                    System.out.print("Enter Phone Number: ");
                    str=br.readLine();
                    phno=Long.parseLong(str);
                    hm.put(name,phno);
                    break;
                case 2:
                    System.out.println("You are searching for element: ");
                    System.out.println("Enter name: ");
                    name=br.readLine();
//                    System.out.println("You are searching for "+name+""+hm.get(name));
                    long a=hm.get(name);
                    if(a==-1){
                        System.out.println(a+" Not founded in "+hm);
                    }else{
                        System.out.println(a+" is founded in "+hm);
                    }
                    break;
                case 3:
                    System.out.println("Data presented in Hashmap is: "+hm);
                    break;
                case 4:
                    System.out.println("You are trying to remove key-value through Key value.");
                    System.out.print("Enter Key value: ");
                    name=br.readLine();
                    Long value=hm.remove(name);
                    if(value==-1){
                        System.out.println(value+" Not removed from "+hm);
                    }else{
                        System.out.println(value+" is removed from "+hm);
                    }
                    break;

                case 5:
                    System.out.println("you are selected for remove all data in "+hm);
                    hm.clear();
                    System.out.println(hm);
                    break;

                case 6:
                    System.out.println("you are enquiring for size of "+hm);
                    System.out.println("Size of "+hm+" is "+hm.size());
                default:
                    System.exit(0);
            }
        }
    }
}
