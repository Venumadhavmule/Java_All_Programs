package Lecture.Collections.List.LinkedList;
/*
Linked list  class:
A linked  list represents a group of nodes such that each node contains 3 fields.
Data field---that stores data
Linked fields--- that refer to the previous node to the next node.
Interview question:
What is the difference between stack and linked lists ?
1.certain operations like insertion and deletion is possible in any place in linked list. But it is possible only on the top of the stack .
2. A stack strictly follows LIFO order.Linked list doesnot follow any order. It can store and retrieve data randomly.
1.To create  a linked list :
LinkedList <E> ll=new LinkedList <E>();
                     Or
LinkedList <E> ll=new LinkedList <>();( 7.0 version)
2. To  add element in the beginning list
  ll.addfirst (element);
to Add element at the ending of list
 ll.addlast(element);
To add the elements (objects) to a linked list
ll.add ( element );
To add element in the nth position
ll.add (n,element);
Note: the above add () methods return Boolean value.
3.To remove first element  from the linked list
ll.removefirst ();
To remove last element from the linked list
ll.removelast();
to remove nth element
ll.remove(n);
the above remove()methods return the element upon successful removal else they return null object .
4.To replace the nth element with a new element .
  ll. set (n, NEW element);
5. to retrieve the first element from the list
element =ll .getfirst();
To get the last element
element = ll .getlast();
To get an element located at nth position in the list.
element = ll .get(n);
6. To remove all elements from the list
ll . clear ();
7. To know the number of elements in the list
int n = ll . size ();
 */
import java.io.*;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) throws IOException {
        LinkedList<String> ll= new LinkedList<String>();
        System.out.println("Linked list: "+ll);
        ll.add("america");
        ll.add("japan");
        ll.add("China");
        ll.add("russia");
        System.out.println("Linked list: "+ll);
//        ll.clear();
//        System.out.println("Linked list: "+ll);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String element;
        int pos,choice=0;
        while(choice<5){
            System.out.println("linked list operations");
            System.out.println("1.insert element");
            System.out.println("2.remove element");
            System.out.println("3.change element");
            System.out.println("4.Get element at position");
            System.out.println("5.exit");
            System.out.println("your choice:");
            choice=Integer.parseInt(br.readLine());
            switch (choice){
                case 1:
                    System.out.println("enter element:");
                    element=br.readLine();
                    System.out.println("enter position:");
                    pos=Integer.parseInt(br.readLine());
                    ll.add(pos,element);
                    break;
                case 2:
                    System.out.println("enter position:");
                    pos=Integer.parseInt(br.readLine());
                    ll.remove(pos);
                    break;
                case 3:
                    System.out.println("Enter element: ");
                    element=br.readLine();
                    System.out.println("Enter position: ");
                    pos=Integer.parseInt(br.readLine());
                    ll.set(pos,element);
                    break;
                case 4:
                    System.out.println("enter position");
                    pos=Integer.parseInt(br.readLine());
                    System.out.print(ll.get(pos));
                default:
                    return;
            }
            System.out.println("Linked List: "+ll);

        }
    }
}
