package OOPS;

public class Encapsulation {

    private int value;

    public void setValue(int x){

        value=x;

    }

    public int  getvalue(){

        return  value;
    }

}
class b{

    public static void main(String[] args) {

        Encapsulation En=new Encapsulation();
        En.setValue(100);
        System.out.println(En.getvalue());
    }
}
