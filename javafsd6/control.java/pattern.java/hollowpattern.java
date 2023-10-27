
public class hollowpattern {
 // square  holo pattern //
 static void hp1(int n){
   for(int r=1;r<=n;r++)
   {
    for(int c=1;c<=n;c++)
    {
     if (r==1|| r==n||c==1||c==n)
     {
      System.out.print("* ");
     }
     else
     {
      System.out.print("  ");
     }
    }
    System.out.println();
   }
  }  
  // plus holo ptrn//
  static void hp2(int n)
  {
    for(int r=1;r<=n;r++)
    {
       for(int c=1;c<=n;c++
       ){

      if(c==(n/2)+1||r==(n/2)+1)
      {
        System.out.print("* ");
      }
      else
       {
       System.out.print("  ");
       }
      }
      System.out.println();
    }
  } 

  //cross holo ptrn//
static void hp3(int n)
  {
    for(int r=1;r<=n;r++)
    {
       for(int c=1;c<=n;c++
       ){

      if(r==c||r+c==n+1)
      {
        System.out.print("* ");
      }
      else
       {
       System.out.print("  ");
       }
      }
      System.out.println();
    }
  }
// right  increasing holo ptrn//
static void hp4(int n)
  {
    for(int r=1;r<=n;r++)
    {
       for(int c=1;c<=n;c++)
       {

      if(c==1||r==n||r==c)
      {
        System.out.print("* ");
      }
      else
       {
       System.out.print("  ");
       }
      }
      System.out.println();
    }
  }
  //right decreasing holo ptrn////
  static void hp5(int n)
  {
    for(int r=1;r<=n;r++)
    {
       for(int c=1;c<=n;c++)
       {

      if(c==1||r==1||r+c==n+1)
      {
        System.out.print("* ");
      }
      else
       {
       System.out.print("  ");
       }
      }
      System.out.println();
    }
  }

// left increasing holo ptrn//
static void hp6(int n)
{
for(int r=1;r<=n;r++)
{
  for(int c=1;c<=n;c++)
  {
    if (r+c==n+1||r==n||c==n)
    {
     System.out.print("* ");
    }
    else
    {
     System.out.print("  ");
    }
  }
  System.out.println();
  }
}
  //left decreasing holo ptrn//
  static void hp7(int n)
  {
   for(int r=1;r<=n;r++)
   {
    for(int c=1;c<=n;c++)
    {
     if(r==1||r==c||c==n)
     {
      System.out.print("* ");
     }
     else {
      System.out.print("  ");
     }
    }
    System.out.println();
   }
  }

  //hill holo ptrn//
  static void hp8(int n)
  {
    for(int  r=1;r<=n;r++)
    {
      for(int c=1;c<=n;c++){
        if(r+c==n+1||r==n||c==n)
        {
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      for(int c=1;c<=n;c++)
      {
        if(r==n||r==c )
        {
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
 public static void main(String[] args)
  {
    int n=6;
   hp1(n);
   System.out.println();
   hp2(n);
   System.out.println();
   hp3(n);
   System.out.println();
   hp4(n);
   System.out.println();
   hp5(n);
   System.out.println();
   hp6(n);
   System.out.println();
   hp7(n);
   System.out.println();
   hp8(n);
   System.out.println();

 }
}
 