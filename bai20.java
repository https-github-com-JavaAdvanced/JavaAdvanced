package baitapjava;

import java.util.Scanner;

public class bai20 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int so, cp;
        System.out.print("moi nhap so kW da tieu thu :");
        so = sc.nextInt();
        cp = so * 500;
        if (so > 100) {
            cp = cp + (so - 100) * 300;
        }
        if (so > 250) {
            cp = cp + (so - 250) * 200;
        }
        if (so > 350) {
            cp = cp + (so - 350) * 500;
        }
        System.out.println("chi phi la " + cp);

    }
}
