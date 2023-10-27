

public class fsd5class {
   //****************instance variable *********************** */
    String name ;
    int age ;
    int   rollno;

   //*********************parameterized constructor ************************ */
    fsd5class (String  x,int  y ,int z)
    {
      name =x;
      age =y;
      rollno=z;
    }

    public static void main (String []args )
    
    {
     fsd5class a = new fsd5class( "mona ",21,48);
      fsd5class b = new fsd5class("deepa",20,47);
      fsd5class c = new fsd5class( "seekha ",20,49);
//***********************printing instance variable values*******************************************************
 /*:a referance  variable :*/ 

System.out.println("name is "+a.name);
System.out.println("age of  "+a.name+"is"+a.age);
System.out.println("rollno of  "+a.name+"is"+a.rollno);

/*: b referance variable : */
System.out.println("name is "+b.name);
System .out.println("age of "+b.name +"is"+b.age);
System.out.println("rollno of "+b. name+"is"+b.rollno);
/*:c referance variable : */
System.out.println("name is "+c.name);
System.out.println("age is "+c.name+"is"+c.age);
System.out.println("rollno is "+c.name+"is"+c.rollno);


    }


}