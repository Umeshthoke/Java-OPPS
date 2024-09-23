package OOPS;



public class Numberformateexception {
    public static void main(String[] args) {


        String s1 = "Umesh";

        try {

            int a = Integer.parseInt(s1);
            System.out.println(a);

        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println("exception occur");

    }

}
