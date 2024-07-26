package Lecture.Basics;

public class Jumping_Statements {
    public static void main(String []args){
        int[][] arrayOfInts = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        int searchFor=2000;
        boolean isFound=false;
        loop:
        for(int i=0;i<arrayOfInts.length;i++){
            for(int j=0; j<arrayOfInts[i].length; j++){
                if(arrayOfInts[i][j]==searchFor){
                    isFound=true;
                    break loop;

                }
            }
        }
        if(isFound){
            System.out.println(searchFor+" Number is founded.");
        }else{
            System.out.println(searchFor+" is not founded");
        }

        //Infinite iterations by using for loop
        for(;;){
            System.out.println("hii");
        }


    }
}
