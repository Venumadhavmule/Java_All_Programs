package Lecture.String.StringsProblems;

import java.util.Arrays;

public class LargestSubstringWithoutRepeating {
    public static void main(String args[]) {
//        String original = "HI,HYDERABADBADKOW";
//        char[] charArray1= original.toCharArray();
//        int lengthArray[] = new int[original.length()];
//        for(int i =0; i<charArray1.length;i++) {
//            String temp= ""+charArray1[i];
//            for(int j=i+1; j< charArray1.length;j++) {
//               if(temp.indexOf(charArray1[j])!=-1) {
//                   //lengthArray[i] = temp.length();
//                   break;
//               }else {
//                   temp += charArray1[j];
//               }
//            }
//            lengthArray[i]=temp.length();
//        }
//        Arrays.sort(lengthArray);
//        System.out.println("The longest substring without repeating characters: "+lengthArray[lengthArray.length-1]);






















        String input="HI,HYDERABADBADKOW";
//        input = input.replace(",","");
//        System.out.println(input);
        char[] inputCharArray = input.toCharArray();
        int[] lengthArray = new int[inputCharArray.length];
        for(int i=0; i<inputCharArray.length;i++) {
            String temp = ""+inputCharArray[i];
            for(int j=i+1 ; j<inputCharArray.length; j++){
                if(temp.indexOf(inputCharArray[j])==-1){

                    temp+=inputCharArray[j];
                }else {
                    break;
                }
            }
           lengthArray[i]=temp.length();
        }
        Arrays.sort(lengthArray);
        System.out.println("the longest substring without repeating characters: "+lengthArray[lengthArray.length-1]);
    }
}
