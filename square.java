public class square{
static int squ(int n)// static function
{
  int squ=n*n;
   return squ;
}
  int square_of(int n)//non static function 
  {
    int squ= n*n;
  return squ;
  }
public static void main(String []args)
{
  square x =new square();
  int n=5;
  int p=62;
 System.out.println("square of "+p+"is="+x.square_of(p));//calling non static function

 System.out.println("square of "+n+"is="+squ(n));// calling static function
}

}

    

