package OOPS;

interface interfaceMultiple {

    public void display();


}
interface multiple{

    public void display();

}
class umesh4 implements interfaceMultiple,multiple{

    @Override
    public void display() {

        System.out.println("hi Umesh you learning the multiple inheritance using interface");

    }

    public static void main(String[] args) {
        umesh4 u=new umesh4();
        u.display();
    }
}
