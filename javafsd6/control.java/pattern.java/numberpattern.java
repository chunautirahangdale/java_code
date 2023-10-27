
public class numberpattern
 {
    
public static void main(String[] args)
 {
  //holllow diamond//
   for (int i=1;i<=7;i++)
   {
    for(int j=1;j<=7;j++)
    {
     if((i+j== 5)||i+j==11|| j-i== 3 || i-j== 3)
     {
     System.out.print("*");
     }
     else
     {
      System.out.print(" ");
     }   
    }
    System.out.println();
  
   }
//holllow triangle//
for(int i=1;i<=4;i++)
{
for(int j=1;j<=7;j++)
{
if((i+j==5)||(j-i==3)||(i==4&&j%2!=0))
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}




//pyramid  number pattern//
for(int i=1;i<=5;i++)
{
  for(int k=i;k<=5;k++)
  {
   System.out.print(" ");
  }
  for(int j=1;j<=i;j++)
  {
   System.out.print(i);
  }
  for(int k=1;k<i;k++)
  {
   System.out.print(i);
  }
  System.out.println();

}

 
 //number pattern2//
for(int i=5;i>=1;i--)
{
for(int k=1;k<=5-i;k++)
{
System.out.print(" ");
}
for(int j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}


//pattern3 //
  int n=6;
for(int i=n;i>=1;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(j+"");
}
System.out.println();
}

//palindrome triangle pattern//

for(int i=1;i<=n;i++)
{
for(int j=1;j<=2*(n-i);j++)
{
System.out.print(" ");
}
for(int j=i;j>=1;j--)
{
System.out.print(j+" ");
}
for(int j=2;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}



//cross number pattern//
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==j||i+j==6)
{
System.out.print(i);
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
}
}