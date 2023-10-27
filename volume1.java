public class volume1 {
     

   // Volume of Coboid Formula V = L*W*H 
     static long Volume_of_Cuboid( int l, int w, int h )
      {
         int v = l*w*h;
         return v;
      }
    
      // Volume of cube(V) = side length^3 = a^3
     static int Volume_of_cube( int lengthside )
      {
         int v1 = lengthside*lengthside*lengthside;
         return v1;
      }

      // Volume of cylinder (V) = πr^2h ( pai = 3.14)
      static double Volume_of_cylinder( double r, double h)
      { 
         double v2 = 3.14*r*r*h;
         return v2;
      }

      // Volume of Sphere:(V) = (4/3)πr^3
      static double volume_of_sphere( int radius)
      {
         double S = 4/3*3.14*radius*radius*radius;
         return S;
      }

      // volume of Pyramid V = (1⁄3) × B × h
     static double volume_of_Pyramid( int areaofbase, int hightofpyramid)
      {
         double V3 = 0.3333333333333*areaofbase*hightofpyramid;
         return V3;
      }

      // volume of prism V = B*H
      static int volume_of_prism( int length, int hight )
      {
         int P = length*hight;
         return P;
      }

      // volume of cone = 1/3*22/7 or 3.14*r^2*h (Volume (V) = (1/3)πr^2h)
      static double volume_of_cone( double circlurbase, double Hight)
      {
         double cone = 0.33*3.14*circlurbase*Hight;
         return cone;
      }

      // Ellipsoid: Volume (V) = (4/3)πabc
       static double volume_of_Ellipsoid(int a, int b, int c)
      {
         double E = 1.33333333333* 3.14*a*b*c;
         return E;
      }

      public static void main(String[] args) {

         // Output of the cuboid of volume
         int l = 275;
         int w = 180; 
         int h = 140; 
         int V =  l*w*h;
         System.out.println("volume of cuboid = " + V + " cm^3"); 

           // Output of the cube of volume
         int lengthside = 240;
         Volume_of_cube(lengthside );
         System.out.println( "volume of cube = " + Volume_of_cube(lengthside ) + " cm^3");

        //  Output of the cylinder of volume
        double r = 30.20;
        double h1 = 20.30;
        Volume_of_cylinder(r, h1);
        System.out.println( "volume of cylinder = " + Volume_of_cylinder(r, h1) + " cm^3");

        // Output of the sphere of volume
        int radius = 400;
        volume_of_sphere(radius);
        System.out.println( "volume of sphere = " + volume_of_sphere(radius) + " cm^3");

        // Output of the pyramid of volume
        int areaofbase = 50;
        int hightofpyramid = 100;
        volume_of_Pyramid( areaofbase, hightofpyramid);
        System.out.println("volume of pyramid = " + volume_of_Pyramid(areaofbase, hightofpyramid) + " cm^2");

        //  Output of the prism of volume
        int length = 100;
        int  hight = 200;
        volume_of_prism(length, hight);
        System.out.println( "volume of prism " + volume_of_prism( length, hight) + " cm^2");

        // Output of the cone of volume
        double circlurbase = 20.10;
        double Hight = 50.10;
        volume_of_cone(circlurbase, Hight);
        System.out.println("volume of vone = " + volume_of_cone(circlurbase, Hight) + " cm^2");

        // Output of the Ellipsiod of volume
        int a = 20;
        int b = 30;
        int c = 40;
        volume_of_Ellipsoid( a,b,c);
        System.out.println( "volume of Ellipsoid = " + volume_of_Ellipsoid( a,b,c) + " cm^3");




      }
}
