package OOPS;

public class Nullpointerexception2 {

    public static void main(String[] args) {
        String str = "null"; // This is a valid string, not a null value
        try {
            System.out.println(str.toUpperCase()); // This will work fine, no exception is thrown
        } catch (NullPointerException e) {
            System.out.println(e); // This catch block will not execute
        }
    }
}
