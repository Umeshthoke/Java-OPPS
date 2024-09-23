package OOPS;

public class Default_Constructor {

    int a;
    String b;
    boolean c;

    Default_Constructor() {

        a = 10;
        b = "Umesh";
        c = true;
    }

    void Disp() {

        System.out.println(a + " " + b + " " + c);

    }
}

    class test3{

        public static void main(String[] args) {

            Default_Constructor d=new Default_Constructor();
            d.Disp();

        }

}
