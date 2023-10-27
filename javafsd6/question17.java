public class question17 {
 
 public static void main(String[] args) {
    double a=4.5;
    double b=5.5;
    double c=6.5;
    
    double t1=(b*b-4*a*c);
     if(t1>0){
     double root1=(double)(-b + Math.sqrt(t1))/(2*a);
      double root2=(double)(-b - Math.sqrt(t1))/(2*a);
    System.out.println( "the root of the equation are :"+root1+"and"+root2);
     }
    else if (t1==0){
        double root= -b/(2*a);
    
        System.out.println("the root of the equation is :"+root);
    }
     else{
        double realpart= -b/(2*a);
        double imaginarypart= (double)(Math.sqrt(-t1)/(2*a));
        System.out.println("the root of the equation are:"+realpart+"+"+imaginarypart+"i and"+realpart+"-");
     } 
 }   
}
