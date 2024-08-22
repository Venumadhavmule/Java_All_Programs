package Lecture.Collections.List.Vector;
import java.util.Vector;

/*
Vector :
        ------> Vector is Synchronised.
        -----> ArrayList Is not Synchronised.
Vector class:
It is dynamically growing array that stores objects ( elements) a vector is similar to arraylist ,but it is synchronized.
1.To create a vector
Vector <E>v= new vector <E>():
Vector <E>v=new vector <E> (int n );//n= initial capacity
2.to add objects, use add () mehod
v.add (element);
the above method returns Boolean value
v.add (n,element );
the above method returns void
3.To remove a particular  element from the vector.
v.remove (element);
the above method returns Boolean value
to remove element at nth position
element = v.remove (n);
4..to remove all of the elements from the vector
v. clear();
this method returns void
5.to return element at the nth position
Element = v.get(n);
6.to know  no of objects ,use size ()
Int n =v.size();
7.to convert the vector into an array , to array ()
Object x[]=v.toarray();

 */
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        int x[] = {33, 44, 55, 66, 70};
        for (int i = 0; i < x.length; i++)
            v.add(x[i]);
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));
        ListIterator lit = v.listIterator();
        System.out.println("in forward directon:");
        while (lit.hasNext())
            System.out.println(lit.next() + "   ");
        System.out.println("in reverse directon:");
        while (lit.hasPrevious())
            System.out.print(lit.previous() + "   ");
    }
}
