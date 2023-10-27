public class sumdemo2 {
   int sum( int n)
   {
     int sum=(n*(n+1))/2;
      return sum;
   }
    
public static void main(String []args)
{
sumdemo2 u= new sumdemo2();
int x=u.sum(20);
System.out.println(x);

}

}
