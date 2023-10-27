public class qeustion38 {
   
 public static void main(String[] args) {
    int x=5;
    int y =4;
    int z=2;
    if(x>y&&x>z&&y>z){
       System.out.println("number are in a decreasing order" ); 
    }
    else if (z>y&&z>x&&y>x){
      System.out.println("number are in a increasing order");  
    }
    else{
    System.out.println("number are not both");    
    }
 }   
}
