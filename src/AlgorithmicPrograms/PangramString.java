package AlgorithmicPrograms;

public class PangramString {
    public static void main(String[] args) {
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="The five oxing wizards jump quickly";
        char[] charArrayStr1 = str1.toCharArray();
        str2=str2.toLowerCase().replace(" ","");
        //System.out.println(str2);
        boolean status =true;
        for(int i=0; i<charArrayStr1.length ; i++) {
            if(str2.indexOf(str1.charAt(i)) == -1){
                //System.out.println("This is not pangram number");
                //System.exit(0);
                status =false;
                break;

            }else {
                status = true;
            }
        }
        if(status) {
            System.out.println("This is Pangram String");
        }else {
            System.out.println("This is not a pangram");
        }

    }
}
