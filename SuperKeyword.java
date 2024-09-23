package OOPS;

public class SuperKeyword {

    int a=10;

}

class keyword extends SuperKeyword{

    int a=20;

    public void display(){


        System.out.println(a);
        System.out.println(super.a);   //Super class variable call

    }

    public static void main(String[] args) {

        keyword k=new keyword();
        k.display();
    }
}
