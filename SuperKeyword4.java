package OOPS;

public class SuperKeyword4 {

    SuperKeyword4(int a){

        System.out.println(a);
    }


}

  class keyword5 extends SuperKeyword4{

    keyword5(){

        super(100);             //In Parameterised Constructor we denote the super keyword as Constructor
        System.out.println("enter the name");

    }

      public static void main(String[] args) {

        keyword5 k=new keyword5();
      }

}
