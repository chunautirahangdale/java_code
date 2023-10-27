public class simpleinterest {
  
   int  simple_interest(int p,int r,int t ){

    
 int a=p*r*t/100;
 return a;
   }
public static void main (String []args){
simpleinterest s = new simpleinterest();
System.out.println(s.simple_interest(22,44,5));


}


}
