public class question9 {
   
 public static void main(String[] args)
  {
     int row,space,star;
     for(row=1;row<=9;row++)
     {
         for( space=1;space<=row;space++)
            {
            System.out.print("  ");
            }
             for( star=1;star<=11-2*row;star++)
                {
                System.out.print("* ");   
                }
                 System.out.println();

     }
   }   





}
