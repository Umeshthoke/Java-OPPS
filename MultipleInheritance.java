package OOPS;

public class MultipleInheritance {

    int a,b,c;

    public void addition(){

        a=10;
        b=12;
        c=a+b;
        System.out.println("Addition of number:"+c);
    }
    public void substraction(){

        a=100;
        b=50;
        c=a-b;
        System.out.println("Substraction of number:" +c);
    }
}
    class Multi extends MultipleInheritance{


        public void multiplication() {

            a=10;
            b=20;
            c=a*b;
            System.out.println("Multiplication of number:" +c);
        }
    }
    class division extends Multi{

        public  void  divi(){

            a=100;
            b=2;
            c=a/b;
            System.out.println("Division of number:"+c);
        }

        public static void main(String[] args) {

            division d=new division();
            d.addition();
            d.substraction();;
            d.multiplication();
            d.divi();
        }
    }
