

public class function3 {


public static void main(String[] args) {
    int n=5;
    int r=2;
    int fact=1;
    int fact1=1;
    int fact2=1;

    for(int i=1; i<=n;i++)
    {
   fact=fact*i;
    }
    for(int i=1;i<=n-r;i++)
    {
    fact1=fact1*i;
    }
    for(int i=1;i<=r;i++)
    {
    fact2=fact2*i;
   }
   int factorial=(fact)/(fact1*fact2);
   System.out.println(factorial);
    

}


}
