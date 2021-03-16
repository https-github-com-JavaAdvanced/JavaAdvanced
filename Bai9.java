/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphjava;
import java.util.Scanner;
public class Bai9 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phút : ");
        long x= scanner.nextLong();
        while(x>21600)
            x=x-21600;            
        if(x>=16200)
            System.out.println("x thuộc góc vuông thứ 4");
        else if(x>=10800)
            System.out.println("x thuộc góc vuông thứ 3");
            else if(x>=5400)
                System.out.println("x thuộc góc vuông thứ 2");
                else 
                    System.out.println("x thuộc góc vuông thứ 1");
        float goc = (x/60);
        float radian = (float) (Math.PI * goc / 180);
            System.out.println("cos(" + goc +") = " + Math.cos(radian));
    }
}
