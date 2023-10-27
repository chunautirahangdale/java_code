public class question16 {
    
public static void main(String[] args) {
    int x=11;
    int y=11;
     int z=13;
     if(x==y && y!=z){
     System.out.println("equilateral triangle");   
     }
     else if (x==y||y==z||z==x){
      System.out.println("isosceles triangle");  
     }
     else{
        System.out.println("scalence triangle");
     }
}

}
