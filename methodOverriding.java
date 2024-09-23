package OOPS;

public class methodOverriding {

    public void shape(){

        System.out.println("Shape cant define ");
    }
}

 class square extends methodOverriding{
     @Override
    public void shape(){

        System.out.println("shape would be define");

    }

     public static void main(String[] args) {

        square sh=new square();
        sh.shape();
     }


}
