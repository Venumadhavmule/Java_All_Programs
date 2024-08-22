package RegularExpressions.StringTokenize;
/*
StringTokenizer class:
It is useful to break a string into small pieces,called tokens.Once the string is broken,the tokens will be stored into StringTokinizer object.
1.To create an object to StringTokenizer.
  StringTokenizer st=new  StringTokenizer(str,”delimiter”);
2.To know if tokens are available in the StringTokenizer object
    boolean x=st.hasMoreTokens();
     st.nextToken();
3.To know how many no of tokens are there
   int no=st.countTokens();
 */
import java.util.*;
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String s="hello its a,java program";
        //\s for space delimiter
        StringTokenizer st=new StringTokenizer(s,"\s");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
