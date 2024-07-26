package Lecture.String;

public class StringMethods {
    public static void main(String[] args)  {
        String one = "Hello";
        String two = "Hyderabad";
        String three = "   Good Morning";

        //1.concat two strings
        System.out.println("01.concat:"+one.concat(two));
        System.out.println(one);

        //2.length of String
        System.out.println("02.length(): "+one.length());

        //3."compareTo" first string to second string
        //if compare value is = 0 both strings are equal
        //if compare value is < -1 first string is greater than second string
        //if compare value is > +1 first string is less than second one
        System.out.println("03.compare: "+one.compareTo(two));
        System.out.println(two.compareTo(one));

        //4.Find value at index by using charAt() in string
        System.out.println("04.charAt():"+one.charAt(4));

        String name1 = "Raja";
        String name2 = "raja";
        String name3 = "Venu";

        //5.equals()- use for find whether all content is same include Case type
        System.out.println("05.equals: "+name1.equals(name2));
        System.out.println("== operator: "+(name1 == name2));
        //6.equalsIgnoreCase()
        System.out.println("06.IgnoreCase: "+name1.equalsIgnoreCase(name2));
        //7.startsWith()
        System.out.println("07.startswith: "+name1.startsWith("M"));
        //8.endsWith()
        System.out.println("08.endsWith: "+name3.endsWith("u"));
        //9.replace()
        System.out.println("09:replace: "+name3.replace(name3,name2));
        System.out.println(name3);
        //10.subString(startsFrom,endsWith)
        System.out.println("10.substring with starting and ending index: "+three.substring(5,10));
        //11.subString(startingIndex)
        System.out.println("11.substring startingIndexOnly: "+three.substring(5));
        //12.toLowerCase()
        System.out.println("12.to LowerCase: "+name3.toLowerCase());
        //13.toUpperCase()
        System.out.println("13.to Uppercase: "+name3.toUpperCase());

        //14.trim() - for skip first spaces
        System.out.println("14.trim(): "+three.trim());

        //14.Direct array printing using String
        //String a[2][3] = {{"1","2","3","4"},{"10","20","30"}};
        String array = new String("Hello");
        String newArray = array.toString();
        System.out.println(newArray);

    }
}
