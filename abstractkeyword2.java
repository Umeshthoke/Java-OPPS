package OOPS;

abstract  class abstractkeyword2 {

    public abstract void programmming();

}

class html extends abstractkeyword2{

    @Override
    public void programmming() {

        System.out.println("html is front end language");

    }

}
class java extends abstractkeyword2{

    @Override
    public void programmming() {

        System.out.println("java is used for backend developer");
    }
}
class python extends abstractkeyword2{

    @Override
    public void programmming() {

        System.out.println("Python is mainly used for data science");
    }

    public static void main(String[] args) {

        html h=new html();
        java ja=new java();
        python py=new python();

        h.programmming();
        ja.programmming();
        py.programmming();
    }
}
