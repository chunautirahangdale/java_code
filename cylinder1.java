public class cylinder1 {
  
 static void cylinder(int r,int h){
 System.out.println(3.14*r*r*h);
 } 
 static void surface_area_of_cylinder(int r,int h){
System.out.println(2*3.14*r*h+r);

 }
static void  volume_of_pyramid(int b,int h){
System.out.println((1/3)*b*h);
}
static  void square(int l,int w,int h){
System.out.println(1/3*l*w*h);
}
 static void  circular(int r,int h){
System.out.println(1/3*3.14*r*r*h);

 }
 static void  prism(int b,int h){
System.out.println(b*h);

 }
public static void main (String []args){
System.out.println();
System.out.println("the volume of cylinder");
cylinder(2,4);

System.out.println();
System.out.println("the surface of cylinder");
surface_area_of_cylinder(2,4);

System.out.println();
System.out.println("the volume of pyramid");
pyramid( 5,6);

System.out.println();
System.out.println("the volume of square");
square(3,4,5);

System.out.println();
System.out.println("the volume of circular");
circular(7,8);

System.out.println();
System.out.println("the volume of prism");
prism(8,4);
}



}
