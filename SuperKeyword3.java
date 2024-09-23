package OOPS;

public class SuperKeyword3 {


    String name ="Umesh Thoke";
    int Age=22;

    SuperKeyword3(){

        System.out.println("name:"+name+"  Age:"+Age);
    }


}

class keword4 extends  SuperKeyword3{

       String name="Umesh Rajput";
       int age= 23;

       keword4(){

           //it called the super class construct without right name because of default constructor

           System.out.println("name:"+name+"  Age:"+Age);
       }

    public static void main(String[] args) {

           keword4 key=new keword4();

    }
}
