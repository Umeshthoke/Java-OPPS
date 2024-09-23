package OOPS;

public class SingleInheritance {

    int age;
    int roll;
    String name;

    public void learn() {

        System.out.println("Enter the age,roll and marks");
    }
}

    class student extends SingleInheritance{
        void dislpay(){
            age=22;
            roll=64;
            name="Umesh";
            System.out.println(age+" "+roll+" "+name);

        }

        public static void main(String[] args) {

            student s=new student();
            s.learn();
            s.dislpay();
        }


    }


