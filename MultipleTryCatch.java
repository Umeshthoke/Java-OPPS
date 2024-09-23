package OOPS;

public class MultipleTryCatch {
    public static void main(String[] args) {



    try{

        int a=10,b=0,c;
        c=a/b;

    }
    catch(ArithmeticException a){

        System.out.println("cant devide by zero");

    }
    try{
        int b[]={11,12,13,14,15,16};
        System.out.println(b[6]);


    }
    catch(ArrayIndexOutOfBoundsException r) {

        System.out.println("array index are limit exeed ");
    }

    }
}
