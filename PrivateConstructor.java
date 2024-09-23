package OOPS;

public class PrivateConstructor {


    private PrivateConstructor(){

        int a=10;
        String name="Umesh";

        System.out.println(a+" "+name);
    }

    public static void main(String[] args) {

        PrivateConstructor p=new PrivateConstructor();

    }
}
