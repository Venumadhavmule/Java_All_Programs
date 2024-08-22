package RegularExpressions;

import java.util.Arrays;
import java.util.StringTokenizer;
public class StringTokenize_Split {
    public static void main (String args[]){
        StringTokenizer st=new StringTokenizer("Venu Madhav Reddy"," ");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
        System.out.println();
        // By using delim(delimiter) operator
        StringTokenizer one=new StringTokenizer("04 OCT,2002","-.,/% ");
        while(one.hasMoreTokens()){
            System.out.println(one.nextToken());
        }
    }
}
