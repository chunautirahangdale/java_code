public class fsd6class {
    //************instance veriable********* */
     int age;
     int rollno;
     String Name;
//***************** */
   fsd6class( int x,int y,String N)
   {
     age =x;
    rollno =y;
     Name = N;

   }
  
public static void main (String[]args){

   fsd6class vijay = new fsd6class(  21, 74, "vijay");
   fsd6class vishal =new fsd6class( 20,48,"vishal");  
   fsd6class virendra = new fsd6class( 21,56,"virendra");
   

     System.out.println( " age of vijay ="+vijay.age );
     System.out.println( "rollno of vijay="+vishal.rollno);
     System.out.println( " Name ="+virendra .Name );

      System.out.println();
     System.out.println( "age of vishal="+vishal .age );
     System.out.println( "rollno of vishal="+vishal.rollno);
     System.out.println( "Name of virendra ="+virendra.Name);

     System.out.println(); 
     System.out.println ( "age of virendra="+virendra.age); 
     System.out.println( "rollno of virendra="+virendra.rollno);
     System.out.println( "name of virendra ="+virendra.Name );

}


}