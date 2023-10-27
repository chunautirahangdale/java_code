

public class que11 {
    
static void square(int n)
{

   for(int r=1;r<=n;r++) 
   {
    for(int c=1;c<=n;c++)
      {
  System.out.print("* ");  
      }
     System.out.println();  
   }
}


 static  void it(int n)
 {
  for(int r=1;r<=n;r++) 
   {
    for(int c=1;c<=r;c++)
      {
  System.out.print("* ");  
      }
     System.out.println();  
   }
 }

static  void dt(int n)
 {
  for(int r=1;r<=n;r++) 
   {
    for(int c=r;c<=n;c++)
      {
  System.out.print("* ");  
      }
     System.out.println();  
   }
 }
 
    static void pattern4(int n)
    {
     for(int a=1;a<=n;a++)
     {
       for(int b=1; b<=a;b++)
       {
        System.out.print(" ");
       }
       for(int b=a;b<=n;b++)
       {
     System.out.print("* ");
       }
       System.out.println();
     }
    }
    static void pattern5(int n)
    {
    for(int a=1;a<=n;a++)
    {
     for(int b=a;b<=n;b++)
     {
      System.out.print(" ");
     }
     for(int b=1;b<=a;b++)
     {
      System.out.print("* ");
     }
     System.out.println();
    }
    }
  static void pattern6(int n )
  {
    for(int a=1;a<=n;a++)
    {
     for (int b=a;b<=n;b++)
     {
     System.out.print("* ");

     }
     for(int b=1;b<a;b++)
     {
      System.out.print("* ");
     
     }
     System.out.println();
    }
  }
  
  static void pattern7(int n)
  {
    for(int a=1;a<=n;a++)
    {
      for(int b=a;b<=a;b++)
      {
        System.out.print("* ");
      }
      for(int b=a;b<n;b++)
      {
       System.out.print("* "); 
      }
      System.out.println();
    }
  }
  static void pattern8(int n)
  {
    for(int a=1;a<=n;a++)
    {
      for(int b=a;b<=n;b++)
      {
        System.out.print("  ");
      }
      for( int b=1;b<=a;b++)
      {
         System.out.print("* ");
      } 

       for(int b=1;b<a;b++)
       {
           System.out.print("* ");
       }


        System.out.println();   
    }

    for(int a=1;a<=n;a++)
    {
      for(int b=1;b<=a;b++)
      {
        System.out.print("  ");
      }
      for(int b=a;b<=n;b++)
      {
        System.out.print("* ");
      }
      for(int b=a;b<n;b++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  static void pattern9(int n)
{
  for(int a=1;a<n;a++){
     for(int b=1;b<=a;b++)
     {
      System.out.print("  ");
     }
     for(int b=a;b<=n;b++)
     {
      System.out.print("* ");
     }
   for(int b=a;b<n;b++ )
   {
    System.out.print("* ");
   }
   System.out.println();
  }

  for(int a=1;a<n;a++){
    for(int b=a;b<=n;b++){
      System.out.print("  ");
    }
    for(int b=1;b<=a;b++){
      System.out.print("* ");
    }
    for(int b=1;b<a;b++){
      System.out.print("* ");
    }
    System.out.println();
  }
}
static void pattern10(int n)
{
for(int x=1;x<n;x++){
  for(int b=x;b<n;b++){
    System.out.print("  ");
  }
  for(int b=0;b<x;b++){
    System.out.print(" #");
  }
  for(int b=1;b<x;b++){
    System.out.print(" #");
  }
  System.out.println();
}
for(int  x=2;x<n;x++){
  for(int b=0;b<x;b++){
    System.out.print("  ");
  }
  for(int a=x;a<7;a++){
    System.out.print(" #");
  }
  for(int a=x;a<n;a++){
    System.out.print(" #");
  }
  System.out.println();
}
}


    
  
public static void main(String[] args) 
{
    int n=5;
    square(n);
    System.out.println();
    it(n);
    System.out.println();
     dt(n);
    System.out.println();
    pattern4(n);
    System.out.println();
    pattern5(n);
    System.out.println();
    pattern6(n);
    System.out.println();
    pattern7(n);
    System.out.println();
    pattern8(n);
    System.out.println();
    pattern9(n);
    System.out.println();
    pattern10(n);
    System.out.println();
    
    
}
}
