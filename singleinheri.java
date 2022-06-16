 class single
 {
     public  void car()
     {
         System.out.println("xuv");
     }
 }

    class Subclass extends single
    {
       public void bike()
        {
            System.out.println("suv");
        }
    }
   public class singleinheri
    {
        public static void main(String args[])
        {
            Subclass s1 = new Subclass();
            s1.bike();
            s1.car();
        }
    }

