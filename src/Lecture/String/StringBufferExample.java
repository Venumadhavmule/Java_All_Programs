package Lecture.String;


public class StringBufferExample {
    public static void main(String args [] ){
        StringBuffer obj = new StringBuffer("Good Morning Hyderabad");
        System.out.println(obj);

        //1.append
        System.out.println("1.append: "+obj.append(" & India"));
        System.out.println(obj);

        //2.insert
       System.out.println("2.insert: "+obj.insert(13," Cloudy "));

       //3.delete(x,y) --> delete content in between the x,y range
        System.out.println("3.delete: "+obj.delete(5,12));

        //4.replace(int i, int j,String str)  --> replace string at certain position
        System.out.println("4.replace: "+obj.replace(5,13,"Evening"));

        //5.reverse() ---> it will reverse the entire string
        System.out.println("5.reverse: "+obj.reverse());

        //6.toString() ->> it will convert the mutable stringBuffer into Immutable String type
        System.out.println("6.toString: "+obj.toString());

        //7.length() ---> it will return the entire length of the string
        System.out.println("7.length: "+obj.length());
    }
}
