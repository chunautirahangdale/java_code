
import java.util.*;

public class question19 {
    
public static void main(String[] args) {
   Scanner scn= new Scanner (System.in); 
   System.out.println("enter the five subject number");
   int n1=scn.nextInt();
   int n2=scn.nextInt();
   int n3=scn.nextInt();
   int n4= scn.nextInt();
   int n5= scn.nextInt();
   int total=n1+n2+n3+n4+n5;
   float per =total/5;
   System.out.println("total:"+total);
   System.out.println("persentage:+per");
if (per>=90){
    System.out.println("grade A");
}

else if (per>=80){
System.out.println("grade B");
}
else if (per>=70){
    System.out.println("grade C");
}
else if (per>=60){
    System.out.println("grade D");
}
else if (per>=50){
  System.out.println("grade E");  
}
else if (per>=40){
  System.out.println("grade F");  
}
}
}

