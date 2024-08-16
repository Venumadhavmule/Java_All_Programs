package Lecture.OOPs.classs;

public class LocalClassExample{
    static String regularExpression="[^0-9]";

    public static void validateNumber(String phoneNumber1, String phoneNumber2){
        final int numberLength=10;

        class PhoneNumber{
            String formattedNumber=null;
            PhoneNumber(String phoneNumber){
                String currentNumber=phoneNumber.replaceAll(regularExpression,"");
                if(currentNumber.length()==numberLength)
                    formattedNumber=currentNumber;
                else
                    formattedNumber=null;
            }
            public String getNumber(){
                return formattedNumber;
            }
            public void printOriginalNumbers(){
                System.out.println("Original Numbers are "+phoneNumber1+" and "+phoneNumber2);
            }
        }

        PhoneNumber myNumber1=new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2=new PhoneNumber(phoneNumber2);
        //myNumber1.getNumber();
        if(myNumber1.getNumber()==null)
            System.out.println("First Number is invalid");
        else
            System.out.println("First Number is valid "+myNumber1.getNumber());
        if(myNumber2.getNumber()==null)
            System.out.println("Second Number is invalid");
        else
            System.out.println("Second Number is valid "+myNumber2.getNumber());
    }

    public static void main(String[] args) {
        validateNumber("123-569-9638","789-94-6365");
    }
}
