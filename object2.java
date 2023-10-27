

public class object2 {
   
 int l;   
  int  b;

  object2 (int l1,int b1)
  {
    l=l1;
    b=b1;
  }
  int area (){

    return l*b;

  }

 public static void main (String []args ){

   object2 a = new object2(34,44);
    object2 b=new object2(45,78);
   object2 c =new object2(78,90);
    object2 d =new object2(89,78);
    object2 e= new object2(12,56);

  int p= a.area();
  System.out.println(p);
    int q= b.area();
  System.out.println(q);
    int r= c.area();
  System.out.println(r);
    int s= d.area();
  System.out.println(s);
    int t= e.area();
  System.out.println(t);


 }

 












}
