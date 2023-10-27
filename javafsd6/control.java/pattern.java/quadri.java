public class quadri {


public static void main(String[] args)
 {
    int n=8;
    for(int r=1; r<=n; r++)
    {
     for(int c=r; c<=n; c++)
     {
     System.out.print(" ");
     }
     for(int c=1;c<=n;c++)
     {
      System.out.print("* ");
     }
     System.out.println();
    }
 }
}
