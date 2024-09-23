package OOPS;

public class instance {

    instance(){


        int a=24;
        int b=34;
    }


    {

        int a=10;
        int b=20;

        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {

        instance i=new instance();
    }
}
