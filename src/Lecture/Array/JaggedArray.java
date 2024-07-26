package Lecture.Array;

import java.awt.*;

public class JaggedArray {
    public static void main(String args []) {
        String venu[][] = new String[3][];
        venu[0] =new String[]{"-Bharadwaj","-RajaMohan","-Tarun"};
        venu[1] = new String[]{"-Nellore","-Atmakur","-BujaBujaNellore"};
        venu[2] = new String[]{"-Android","-Developer","-Ui Designer"};

        for(int i = 0; i<venu.length; i++) {
            for(int j=0; j<venu[i].length; j++){
                System.out.print(venu[i][j]+" ");
            }
            System.out.println();
        }
    }
}
