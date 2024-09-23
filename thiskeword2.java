package OOPS;

public class thiskeword2 {

    thiskeword2(){

        int age =20;
        int age2 =23;


            System.out.println(age+" "+age2);

    }
    thiskeword2(int age3){

           this();
        System.out.println(age3);
    }

    public static void main(String[] args) {

        thiskeword2 ke=new thiskeword2(35);
    }
}
