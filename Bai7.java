/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuquoc.baitap;

import java.util.Scanner;

public class Bai7 {

    int a, b;

    public Bai7() {

    }

    public void nhapPhuongTrinh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = sc.nextInt();
        System.out.println("Nhap b = ");
        b = sc.nextInt();
        System.out.println("Phuong trinh : " + a + "X " + b + " = 0");
    }

    public void phuongTrinhBac1() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }

        } else {
            float x = (float) -b / a;
            System.out.println("Nghiem cua phuong trinh x = " + x);
        }

    }

    public static void main(String[] arg) {
        Bai7 bai7 = new Bai7();
        bai7.nhapPhuongTrinh();
        bai7.phuongTrinhBac1();
    }
}
