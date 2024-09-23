package OOPS;

public class Parameterised_Constructor {


    int x;
    String y;

    Parameterised_Constructor(int a,String b){

        x=a;
        y=b;

    }

    void Display(){

        System.out.println(x+" "+y);

    }

}
   class test4{

       public static void main(String[] args) {

           Parameterised_Constructor p=new Parameterised_Constructor(10,"Umesh");

           p.Display();
       }


}
