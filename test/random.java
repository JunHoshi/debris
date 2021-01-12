package test;

import java.util.Random;

public class random {
   public static void ran(){
       Random r=new Random();
       int x=r.nextInt(3);
       System.out.println(x);

       switch (x){
           case 0:
               System.out.println("りんご");
               break;
           case 1:
               System.out.println("ばなな");
               break;
           case 2:
               System.out.println("メロン");
               break;
       }
   }
}
