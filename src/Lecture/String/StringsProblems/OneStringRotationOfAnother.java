package Lecture.String.StringsProblems;

public class OneStringRotationOfAnother {
    public static void main(String[] args) {
        String str1="MANGO";
        String str2="NGOMA";
        if(str1.length()!=str2.length()) {
            System.out.println("This is rotation string");
            System.exit(0);
        }else {
            String str3= str1+str1;
            if(str3.indexOf(str2)!=-1) {
                System.out.println("This is rotation number");
            }else{
                System.out.println("This is not rotation number");
            }
        }
    }
}
