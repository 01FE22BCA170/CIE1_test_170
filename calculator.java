public class calculator extends extended_calculator{

    public static void main(String args[]){

         float opr1=5;
         
         calculator c= new calculator();
         float res1=c.square_root(opr1);
         float res2=c.cube_root(opr1);
         System.out.println("Square root=" +res1);
         System.out.println("Cube root=" +res2);

    }
}