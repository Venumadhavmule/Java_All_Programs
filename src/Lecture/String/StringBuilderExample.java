package Lecture.String;

public class StringBuilderExample {
    public static void main(String [] args) {
        StringBuilder name = new StringBuilder("Venu Madhav Reddy");

        System.out.println("1.append: "+name.append(" Mule"));
        System.out.println(name);

        System.out.println("2.insert: "+name.insert(4,"Reddy"));


        System.out.println("3.delete: "+name.delete(0,4));

        System.out.println("4.replace: "+name.replace(5,10,"Venu "));

        System.out.println("5.reverse: "+name.reverse());

        System.out.println("6.toString: "+name.toString());

        System.out.println("7.length: "+name.length());
    }
}
