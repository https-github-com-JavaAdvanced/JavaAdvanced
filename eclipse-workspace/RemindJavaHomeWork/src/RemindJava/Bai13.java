package RemindJava;

import java.util.Scanner;

public class Bai13 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean check = true;
		int dayofweek, d, m, y;
		System.out.println("Thang phai nam trong doan tu 1 den 12 va nam phai lon hon 1581 ");
		System.out.println("Nhap ngay ");
		d = sc.nextInt();
		System.out.println("Nhap thang ");
		m = sc.nextInt();
		System.out.println("Nhap nam ");
		y = sc.nextInt();
		if(m >= 1 && m <= 12 && y > 1581)
			if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				if(d >= 1 && d <= 31)
					check = true;
				else
					check = false;
			else if(m == 4 || m == 6 || m == 9 || m == 11)
				if(d >= 1 && d <= 30)
					check = true;
				else
					check = false;
			else
				if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
					if(d >= 1 && d <= 29)
						check = true;
					else
						check = false;
				else
					if(d >= 1 && d <= 28)
						check = true;
					else
						check = false;
		else
			System.out.println("Khong hop le ");
		
		if(check == true) {
			System.out.println("Hop le ");
			dayofweek = (d + ((153 * (m + 12 * ((14 - m) / 12) - 3) + 2) / 5) +
				     (365 * (y + 4800 - ((14 - m) / 12))) +
				     ((y + 4800 - ((14 - m) / 12)) / 4) - 
				    ((y + 4800 - ((14 - m) / 12)) / 100) + 
				    ((y + 4800 - ((14 - m) / 12)) / 400)  - 32045) % 7;
			if(dayofweek == 6)
				System.out.println("Chu nhat ");
			else
				System.out.println("Thu " + (dayofweek + 2));
		}
		else
			System.out.println("Khong hop le ");
	}
}