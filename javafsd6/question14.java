public class question14 {
 
    
 public static void main(String[] args) {
   question14 u= new question14(); 
    int angle1 =u.nextlnt();
   int  angle2=u.nextlnt();
   int angle3=u.nextlnt();
   int sum=angle1+angle2+angle3;
    if (sum==180&& angle1>0 && angle2>0 && angle3>0){
  System.out.println("triangle is valid");  
    }
  else {
    System.out.println("triangle is not valid");
  }
 }
 private int nextlnt(){
    return 0;
 }
 
}
