package baitapjava;

import java.util.Scanner;
public class bai25 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a,b,UCLN,BCNN;
        System.out.print("Moi nhap 2 so :");
        a = sc.nextInt();
        b = sc.nextInt();
        
        int x = a;
        int y = b;
        while( x != y )
            if(x > y)
                x = x-y;
            else 
                y = y-x;
        UCLN = y;
        BCNN = (a*b)/y;
        System.out.println("uoc chung lon nhat cua "+a+" va "+b+" la:"+UCLN);
        System.out.println("uoc chung lon nhat cua "+a+" va "+b+" la:"+BCNN);  
    }
}
