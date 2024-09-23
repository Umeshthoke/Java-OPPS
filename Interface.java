package OOPS;

interface Interface {

    public void webDesign();
    public void webDeveloper();

}
abstract class umesh implements Interface{

    @Override
    public void webDesign() {

        System.out.println(" frame ,color grading , clean website");
    }
}
class ganesh extends umesh{

    @Override
    public void webDeveloper() {
        System.out.println("html css javascript");
    }

    public static void main(String[] args) {

        Interface i=new ganesh();
        i.webDesign();
        i.webDeveloper();

    }
}
