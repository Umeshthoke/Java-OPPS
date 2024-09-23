package OOPS;

import java.util.Scanner;

interface client_Interface {

       void input();
       void output();

}
class employee implements client_Interface{

    String name;
     double salary;

    @Override
    public void input() {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee name:");
        name=sc.nextLine();

        System.out.println("enter the employee salary");
        salary=sc.nextDouble();

    }

    @Override
    public void output() {

        System.out.println(name+" - "+salary);
    }

    public static void main(String[] args) {
        client_Interface c=new employee();
        c.input();
        c.output();
    }
}
