package Lecture.OOPs.ExceptionHandling;

import java.io.*;
import java.lang.*;
class ATM{
    int mbalance=1000;
    ATM(int bal){
        if(bal<=mbalance){
            System.out.print("Successfully Withdrawn");
        }else {
            ATMe e=new ATMe("Insufficient  Balance");
        }
    }
}

class ATMe extends Exception{
    ATMe(String msg){
        super(msg);
        System.out.print(msg);
    }
}

class SbiATM{
    public static void main(String[] args) {
        ATM a=new ATM(6000);
    }
}
