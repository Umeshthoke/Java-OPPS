package OOPS;

public class Constructor {

    int a;
    String name;

    Constructor(){

        a=0;
        name=null;
    }

    void show(){

        System.out.println(a+" "+name);
    }

}

class test2{
    public static void main(String[] args) {

        Constructor r=new Constructor();

        r.show();
    }

}
