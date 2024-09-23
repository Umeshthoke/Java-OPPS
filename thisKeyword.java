package OOPS;

public class thisKeyword {


    int sum=12;     //instance variable
    int add=13;

    thisKeyword(int sum,int add){  // local variable

        this.sum=sum;
        this.add=add;

        System.out.println(sum+" "+add);

    }

    public static void main(String[] args) {

        thisKeyword th=new thisKeyword(12,34);


    }
}
