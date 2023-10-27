public class question32 {
    
public static void main(String[] args) {
    int length=6;
    int breadth=7;
    int area=length*breadth;
    int perimeter=2*(length+breadth);
    System.out.println(area);
    System.out.println(perimeter);
    if(area>perimeter){
      System.out.println("area of rectangle is greater");  
    }
    else
    {
     System.out.println("perimeter is greater");
    }
}


}
