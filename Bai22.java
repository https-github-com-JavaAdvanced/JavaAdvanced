/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phuquoc.baitap;
import java.util.Scanner;
public class Bai22 {
    int n;

    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen duong n : ");
        n = sc.nextInt();  
    }
    public void Result()
    {
        int D = 0;
        int sum = 0;
        System.out.print("Cac uoc : ");
        for(int i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                D += 1;
                sum += i;
                System.out.printf(i + " ");
            }
        }
        System.out.println("\nSo uoc : "+D);
        System.out.println("Tong so uoc : "+sum);
    }
    public static void main(String[] args) {
        Bai22 bai22 = new Bai22();
        bai22.Input();
        bai22.Result();
    }
}
