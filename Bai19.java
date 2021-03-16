/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphjava;

import java.util.Scanner;
public class Bai19 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hai môc thời gian theo giờ phút giây:");
        int s1,m1,h1,s2,m2,h2;
            h1 = scanner.nextInt();
            m1 = scanner.nextInt();
            s1 = scanner.nextInt();
            h2= scanner.nextInt();
            m2 = scanner.nextInt();
            s2 = scanner.nextInt();
            if(s1>s2){
                s2=s2+60;
                m1=m1+1;
            }
            if(m1>m2){
                m2=m2+60;
                h1=h1+1;
            }
            System.out.println("thời gian giwau hai mốc là : "+(h2-h1)+" giờ "+(m2-m1)+" phút "+(s2-s1)+" giây");
    } 
}
