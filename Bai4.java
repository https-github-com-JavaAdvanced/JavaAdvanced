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
public class Bai4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ba cạnh của tam giác ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s;
       /* if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Đây không phải là tam giác !");
        } else {
            if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Đây là tam giác cân !");
            } else if ((a == b) && (b == c) && (c == a)) {
                System.out.println("Đây là tam giác đều !");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Đây là tam giác vuông !");
            } else {
        double p = (a + b + c) / 3;
            s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("S = "+s);
                System.out.println("là tam giác thường");
            }
            
        }*/
        // 
        if ((a + b > c) && (a + c > b) && (b + c > a))
        {
            if (((a == b) || (b == c) || (c == a))&&(a!=b)||(a!=c)||(b!=c))
                System.out.println("Tam giac can");
            else
            {
                if (a == b && b==c)
                    System.out.println("Tam giac deu");
                else{
                    if( a * a == b * b + c * c || (b * b == a * a + c * c) || (c * c == b * b + a * a))
                        System.out.println("Tam giac vuong");
                    else
                        System.out.println("Tam giac thuong");
                        
                }
            }
        }
        else
            System.out.println("Khong phai tam giac!");
        if ((a + b > c) && (a + c > b) && (b + c > a))
        {
            double p = (a + b + c) / 3;
            double d = p*(p-a)*(p-b)*(p-c);
            s = Math.sqrt(d);
            System.out.println("S = "+s);
        }
     }
}
