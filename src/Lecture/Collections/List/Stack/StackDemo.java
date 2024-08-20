package Lecture.Collections.List.Stack;
/*
1. To create a stack:
Stack < E > st= new Stack <E>();
2. To know whether a stack is empty or not,use empty();
boolean b =st .empty ();
3.To push an element into the stack :
        st.push (element);
4.To pop an element from the stack:
Object element =st. pop();
5.To search for an element in the stack:
int i= st.search (element);
This method returns -1 if the element  is not found .
*/
import java.io.*;
import java.util.*;
public class StackDemo {
    public static void main(String[] args)throws IOException {
        Stack<String> st=new Stack<String>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int pos,choice=0;
        String element;
        while (choice<4) {
            System.out.println("stack operations");
            System.out.println("-----------------");

            System.out.println("1.push element");

            System.out.println("2.pop element");

            System.out.println("3.search for element");
            System.out.println("4.exit");
            System.out.println("your choice:");
            choice=Integer.parseInt(br.readLine());
            switch (choice){
                case 1:
                    System.out.println("Enter element:");
                    element=br.readLine();
                    st.push(element);
                    break;
                case 2:
                    String last=st.pop();
                    System.out.println("Popped value: "+last);
                    break;
                case 3:
                    System.out.println("Enter a element for search:");
                    element=br.readLine();
                    pos=st.search(element);
                    if(pos==-1){
                        System.out.println("Element not found");
                    }else {
                        System.out.println("Element found at position: "+pos);
                    }
                    break;
                default:
                    return;

            }
            System.out.println("Stack: "+st);
//            System.out.println("Before add elements Stack : " + st);
//            System.out.println("is stack is empty: " + st.empty());
//            System.out.println("After Add an element: " + st.push("Kesav"));
//            System.out.println("After Add an element: " + st.push("Venu"));
//            System.out.println("After Add an element: " + st.push("Arun"));
//            System.out.println("After Add an element: " + st.push("Santhosh"));
//            System.out.println("After Add an element: " + st.push("Raja"));
//            System.out.println("After add some elements Stack : " + st);
//
//            System.out.println("After remove last Element: " + st.pop());
//            System.out.println("After add some elements Stack : " + st);
//
//            System.out.println("Search element: " + st.search("Santhosh"));
//            System.out.println("Search element: " + st.search("Arun"));
        }
    }
}
