package AlgorithmicPrograms;

import java.util.Arrays;

// check Whether the two strings have same length and same characters...
public class AnagramStrings {
    public static void main(String args[]) {
        String str1 = "Keep";
        String str2 = "Peek";
        boolean output = true;
        if(str1.length()!= str2.length()){
            output = false;
        }else {
            char[] arrayS1= str1.toLowerCase().toCharArray();
            char[] arrayS2 = str2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            output=Arrays.equals(arrayS1,arrayS2);
        }
        if(output){
            System.out.println("These Strings are anagram Strings");
        } else{
            System.out.println("These Strings are not anagram Strings");
        }
    }
}
