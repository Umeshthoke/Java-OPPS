package OOPS;

public class trycatchblock {
    public static void main(String[] args) {

        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

        }
        catch(ArithmeticException e){
            System.out.println(e);


        }
        finally {
            System.out.println("Code Executed sucessfully");


        }

        System.out.println("main method executed ");
    }


}
