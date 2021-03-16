package RemindJava;

import java.util.Scanner;

public class Bai18 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int hour;
		System.out.println("Nhap so gio ");
		hour = sc.nextInt();
		System.out.println(hour / (24 * 7) + " tuan " + (hour % (24 * 7)) / 24
				+ " ngay " + (hour % (24 * 7)) % 24 + " gio ");
	}

}
