package OOPS;

public class MethodOverloading {

    public void hash(){

        int a=10;
        int b=20;
        int c=a+b;

        System.out.println("Addition "+c);
    }
    public void hash(int a,String name){

        System.out.println(a+" "+name);

    }

    public void hash(int a, double b,int c){

        System.out.println(a+" "+b+" "+c);

    }

    public static void main(String[] args) {
        MethodOverloading has=new MethodOverloading();
       has.hash();
       has.hash(12,"Umesh");
       has.hash(12,34.4,34);

    }
}
