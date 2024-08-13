package AlgorithmicPrograms;

public class Vowels_Consonants_Count {
    public static void main(String [] args) {
        String name = "Venumadhav Reddy";
        name = name.toLowerCase().replace(" ","");
        char[] charArray = name.toCharArray();
        int vowels=0,consonants=0;
        for(int i=0; i<name.length(); i++) {
            char temp=charArray[i];
            if(temp=='a' || temp=='e' ||temp=='i' ||temp=='o'||temp=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("No.of Vowels are: "+vowels+"\nNo.of Constants are:"+consonants);
    }
}
