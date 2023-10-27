import java.util.Scanner;

public class func6 {
    
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
   // int d=scn.nextInt();
    int ans=fact(n);
    System.out.println(ans);
}
public static int fact(int n){
    int count=0;
  for(int i=1;i*i<=n;i++){
    if(n%i==0){
      count=count+2;  
    }
  } 
  return count; 
}
}
