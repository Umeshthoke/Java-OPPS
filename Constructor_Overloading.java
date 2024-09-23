package OOPS;

public class Constructor_Overloading {

    int age;
    String name;

    Constructor_Overloading(){

        this.age=22;
        this.name="Umesh";

    }
    Constructor_Overloading(int age){

        this.age=age;
        this.name="Umesh";


    }
    Constructor_Overloading(int  age,String name){


        this.age=age;
        this.name=name;



    }

    public  void Displ(){


        System.out.println(age+" "+name);
    }
    public static void main(String[] args) {

        Constructor_Overloading b=new Constructor_Overloading();
        Constructor_Overloading b2=new Constructor_Overloading(22);
        Constructor_Overloading b3=new Constructor_Overloading(22,"Umesh");

        b.Displ();
        b2.Displ();
        b3.Displ();

    }

}

