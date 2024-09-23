package OOPS;

  abstract class  abstractKeyword {

      public abstract void soud();
  }

      class dogi extends abstractKeyword{


          @Override
          public void soud() {

              System.out.println("dog is Barking ");
          }
      }

      class  lion extends abstractKeyword{

          @Override
          public void soud() {

              System.out.println(" lion is roaring");
          }

          public static void main(String[] args) {

            dogi dog=new dogi() ;
            lion l=new lion();

            dog.soud();
            l.soud();



              }
          }






