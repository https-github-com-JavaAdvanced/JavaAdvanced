package RemindJava;

import java.util.Scanner;

public class Bai23 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n;
		System.out.println("Nhap so nguyen duong n ");
		n = sc.nextInt();
		System.out.printf("Cac so hoan hao trong khoang tu 1 den %d la ", n);
		for(int i = 1; i <= n; i++) {
			int s = 0;
			for(int j = 1; j <= i; j++) 
				if(i % j == 0)
					s += j;
			if(s == i * 2)
				System.out.print(i + " ");
		}
	}
}
