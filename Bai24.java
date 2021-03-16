/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphjava;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Bai24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            System.out.println("Nhập số : ");
            int x =scanner.nextInt();
            int a=x%10;
            System.out.println("Chữ số cuối cùng là "+a);
            int b =x;
            while(b>=10)
                b=b/10;
            System.out.println("Chữ số đầu tiên là "+b);
            int c=x,e=0,d = 0,f=x;
            while(c>=10)
            {
                d=d+c%10;
                c=c/10;               
            }
            System.out.println("Tổng các chữ số là "+d);
            while(f!=0){
                e=e*10+c%10;
                f=f/10;
            }
            System.out.println("số đảo ngược là : "+e);
    }
}
