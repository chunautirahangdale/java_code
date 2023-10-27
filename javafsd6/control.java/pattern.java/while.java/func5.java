
import java.util.Scanner;
public class func5 {
    

public static void main(String[] args)
 {
   Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
   int d=scn.nextInt();
   int ans=getfrequency(n,d);
   System.out.println(ans);
 }
public static int getfrequency(int n,int d){
    int count=0;
    while(n!=0){
     int a=n%10;
     if(a==d)  {
       count++; 
     }
     n=n/10; 
    }
    return count;
 
}

}
