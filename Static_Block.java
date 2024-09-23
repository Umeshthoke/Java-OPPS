package OOPS;

public class Static_Block {


    Static_Block(){

        System.out.println("Umesh Thoke Rajput");
    }

    {

        System.out.println("Umesh Thoke");
    }

     static {

         System.out.println("Umesh");
     }

    public static void main(String[] args) {

         Static_Block s=new Static_Block();

    }
}