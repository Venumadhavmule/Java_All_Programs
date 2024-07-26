package Programs.Simple_programs;

import java.net.InetAddress;
import java.util.Arrays;

public class IP_Adrress {
    public static void main(String args[]) throws Exception {
//        int a = 5_00_963;
//        System.out.println(a);
        InetAddress IP = InetAddress.getLocalHost();
        System.out.println("IP of my system is := "+IP.getHostAddress());
    }
}
