package AlgorithmicPrograms;

public class Compress_String_To_Consecutive_Repeat_Characters {
    public static void main(String args[]) {
        String input="tttttuuuutorrrriaaaaalllllll";
        String output="";
        int count=1;
        char prev=input.charAt(0);
        for(int i=1; i<input.length();i++) {

            char current=input.charAt(i);
            if(prev==current) {
                count++;
            }else{
                output=output+prev+count;
                prev=current;
                count=1;
            }
        }
        output=output+prev+count;
        if(output.length()<input.length()){
            System.out.println(output);
        }else {
            System.out.println(input);
        }
    }
}
