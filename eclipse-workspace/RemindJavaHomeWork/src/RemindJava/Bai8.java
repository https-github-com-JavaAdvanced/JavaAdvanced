package RemindJava;

import java.util.Scanner;

public class Bai8 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double a, b, c, delta, x1, x2;
		System.out.println("Nhap he so a ");
		a = sc.nextDouble();
		System.out.println("Nhap he so b ");
		b = sc.nextDouble();
		System.out.println("Nhap he so c ");
		c = sc.nextDouble();
		delta = b * b - 4 * a * c;
		if(delta > 0) {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " x2 = " + x2);
		}
		else if(delta < 0)
			System.out.println("Phuong trinh vo nghiem ");
		else
			System.out.println("Phuong trinh co nghiem kep x0 = " + -b / (2 * a));
	}

}
