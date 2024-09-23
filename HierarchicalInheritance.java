package OOPS;

public class HierarchicalInheritance {

     public void eat(){

         System.out.println("Animal is eating");
     }

}
class dog extends HierarchicalInheritance{

    public void bark(){

        System.out.println("Dog is Barking");
    }
}

class cat extends HierarchicalInheritance{

    public void meow(){

        System.out.println("Cat is Meow");
    }

    public static void main(String[] args) {

        dog d=new dog();

        d.eat();
        d.bark();
        cat c=new cat();
        c.eat();
        c.meow();

    }
}
