package OOPS;

public class Arithmeticexception {

    public static void main(String[] args) {

        int a=10;
        int b=0;
        int c;
        System.out.println("main method stated");
        try{

            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){

            System.out.println("arithmetic exception happen");
        }
        System.out.println("main method ended");
    }
}
