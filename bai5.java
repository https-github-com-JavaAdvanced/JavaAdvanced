package baitapjava;

import java.util.Scanner;

public class bai5 {
	static double area( double xA, double yA, double xB, double yB, double xC, double yC )
	{
	return 0.5* fabs( xA*yB -xB*yA + xB*yC -xC*yB + xC*yA -xA*yC);
	}

	static double fabs(double d) {
		return 0;
	}
    public static void main(String [] args) 
    {
		Scanner sc = new Scanner (System.in);
		double xA, yA, xB, yB, xC, yC, xM,yM;
		double d;
		System.out.printf( "A(xA, yA): ");
		 xA = sc.nextDouble();
		 yA = sc.nextDouble();
		 System.out.printf( "B(xB, yB): ");
		 xB = sc.nextDouble();
		 yB= sc.nextDouble();
		 System.out.printf( "C(xC, yC): ");
		 xC = sc.nextDouble();
		 yC= sc.nextDouble();
		 System.out.printf( "M(xM, yM): "); 
		  xM = sc.nextDouble();
		  yM= sc.nextDouble();
		 d = area( xM, yM, xA, yA, xB, yB ) + area( xM, yM, xA, yA, xC, yC )+ area( xM, yM, xB, yB, xC, yC ) -area( xA, yA, xB, yB, xC, yC ); 
			   if( d > 0) 
				   System.out.printf( "M nam ngoai tam giac ABC\n");
			   else
			     if( area( xM, yM, xA, yA, xB, yB ) == 0||area( xM, yM, xA, yA, xC, yC ) == 0||area( xM, yM, xB, yB, xC, yC ) == 0)
			    	 System.out.printf( "M nam tren canh tam giac ABC\n");
				 else
					 System.out.printf( "M nam trong tam giac ABC\n");
          
}
}
