/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuquoc.baitap;

import java.util.Scanner;

public class Bai12 {

    int a, b, c;
    int d, e, f;

    public void nhapHePhuongTrinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phuong trinh thu nhat : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        System.out.println("Nhao phuong trinh thu hai : ");
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        System.out.println("He phuong trinh :");
        System.out.println(a + "X " + b + "Y = " + c);
        System.out.println(d + "X " + e + "Y = " + f);
    }

    public void tinhNghiem() {
        int D, Dx, Dy;
        D = a * e - d * b;
        Dx = c * e - f * b;
        Dy = a * f - d * c;
        if (D != 0) {
            System.out.println("He phuong trinh ci nghem duy nhat :");
            System.out.println("x = " + (float) Dx / D);
            System.out.println("y = " + (float) Dy / D);
        } else {
            if (Dx == 0 && Dy == 0) {
                System.out.println("He phuong trinh vo so nghiem;");
            } else {
                System.out.println("He phuong trinh vo nghiem.");
            }
        }
    }

    public static void main(String[] args) {
        Bai12 bai12 = new Bai12();
        bai12.nhapHePhuongTrinh();
        bai12.tinhNghiem();
    }
}
