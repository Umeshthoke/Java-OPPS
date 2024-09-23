package OOPS;

public class copyConstructor {


    String name;
    int a;

    copyConstructor(String name,int a){

        this.name=name;
        this.a=a;
    }
    copyConstructor(copyConstructor copyConstructor){

        this.name=copyConstructor.name;
        this.a=copyConstructor.a;

    }
    void display(){

        System.out.println(name+" "+a);
    }

    public static void main(String[] args) {

        copyConstructor t=new copyConstructor("Umesh",22);
        copyConstructor t1=new copyConstructor(t);

        t.display();
        t1.display();
    }
}


