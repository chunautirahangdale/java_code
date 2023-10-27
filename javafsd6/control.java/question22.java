
public class question22 {
    

public static void main(String[] args)
 {
    Scanner input= new Scanner(System.in);
    System.out.print("enter the digits:");
    int num=input.nextInt();
    int rem,sum=0,a=num;
    while(num>0)
    {
      rem=num%10;
      sum=(sum*10)+rem;
      num=num/10;
    }
    if(a == sum)
    
      System.out.print("equal..");
    else
    System.out.print("not equal..");
 }
}
