package OOPS;

public class Parameterised_Constructor2 {


    int a=10;
    int b=15;

    Parameterised_Constructor2(int a,int b){

        this.a=a;
        this.b=b;
    }

    void display(){

        System.out.println(a+" "+b);

    }
}
class test5{

    public static void main(String[] args) {

        Parameterised_Constructor2 e=new Parameterised_Constructor2(12,13);
        e.display();
    }
}
