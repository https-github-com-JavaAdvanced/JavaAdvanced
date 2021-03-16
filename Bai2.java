/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuquoc.baitap;

import java.util.Scanner;

public class Bai2 {

    int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Bai2() {

    }

    public void nhapToaDo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x = ");
        x = sc.nextInt();
        System.out.println("Nhap y = ");
        y = sc.nextInt();
    }

    public static void main(String[] args) {
        Bai2 A = new Bai2();
        Bai2 B = new Bai2();
        A.nhapToaDo();
        B.nhapToaDo();
        double kc = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
        System.out.print("Khoang cach giua hai diem A, B : " + kc);
    }
}
