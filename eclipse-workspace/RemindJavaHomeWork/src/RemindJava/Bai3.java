package RemindJava;

import java.util.Scanner;

public class Bai3 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double xC, yC, xM, yM, R;
		System.out.print("Nhap hoanh do cua duong tron, xC = ");
		xC = sc.nextDouble();
		System.out.println("Nhap tung do cua duong tron, yC = ");
		yC = sc.nextDouble();
		System.out.println("Nhap ban kinh cua duong tron, R = ");
		R = sc.nextDouble();
		System.out.println("Nhap hoanh do cua diem M, xM = ");
		xM = sc.nextDouble();
		System.out.println("Nhap tung do cua diem M, yM = ");
		yM = sc.nextDouble();
		if( ((xM - xC) * (xM - xC) + (yM - yC) * (yM - yC))  < R*R) 
			System.out.println("Diem M nam ben trong duong tron tam C ");
		else if( ((xM - xC) * (xM - xC) + (yM - yC) * (yM - yC))  > R*R)
			System.out.println("Diem M nam ben ngoai duong tron tam C ");
		else
			System.out.println("Diem M nam tren duong tron tam C ");
	}
}
