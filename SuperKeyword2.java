package OOPS;

public class SuperKeyword2 {

    int age= 22;

    public void age(){

        System.out.println(age);

    }

}

class number extends SuperKeyword2{

    int age= 23;

    @Override
    public void age() {
        System.out.println(age);
        super.age();              //super class method called
    }

    public static void main(String[] args) {

        number num=new number();
        num.age();
    }
}
