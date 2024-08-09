package Lecture.OOPs.Interfaces;

interface Printable {
    void xerox();
}
interface Showable {
        void showable();
}
class Test implements Showable,Printable{
        public void xerox(){
            System.out.println("Print");
        }
        public void showable(){
            System.out.println("Show");
        }


    public static void main(String[] args) {
        Test n=new Test();
        n.xerox();
        n.showable();
    }
}
