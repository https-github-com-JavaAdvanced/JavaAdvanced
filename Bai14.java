/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dphjava;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("nhập ngày tháng năm");
            int y = 0,m = 0,d = 0;
            int day = scanner.nextInt();
            int month = scanner.nextInt(); 
            int year = scanner.nextInt();            
            switch ( month ) {       
                case 2:
                    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        if(day == 29){
                            m = month +1;
                            d = 1;
                            y = year;
                        }
                        else {
                            m = month ;
                            d = day+1;
                            y = year;
                    }      
                    else
                        if(day == 28){
                            m = month +1;
                            d = 1;
                            y = year;
                        }
                        else {
                            m = month ;
                            d = day+1;
                            y = year;
                    }                        
                break;
                case 11:
                case 4:
                case 6:
                case 9:
                    if(day == 30){
                        m = month +1;
                        d = 1;
                        y = year;               
                    }
                    else {
                        d= day + 1;
                        m = month;
                        y = year;
                    }
                case 12:
                    if(day == 31){
                        m = month +1;
                        d = 1;
                        y = year + 1;
                    }
                default:
                    if(day == 31){
                        m = month +1;
                        d = 1;
                        y = year;
                    }
                    else
                       {
                        d= day + 1;
                        m = month;
                        y = year;
                    } 
                    }
            System.out.println("ngày mai : "+d+" / "+m+" / "+y);
             switch ( month ) {       
                case 3:
                    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                        if(day == 1){
                            m = month -1;
                            d = 29;
                            y = year;
                        }
                        else {
                            m = month ;
                            d = day-1;
                            y = year;
                    }      
                    else
                        if(day == 1){
                            m = month -1;
                            d = 28;
                            y = year;
                        }
                        else {
                            m = month ;
                            d = day-1;
                            y = year;
                    }       
                break;
                case 11:
                case 4:
                case 6:
                case 9:
                    if(day == 1){
                        m = month - 1;
                        d = 31;
                        y = year;               
                    }
                    else {
                        d= day - 1;
                        m = month;
                        y = year;
                    }
                case 1:
                    if(day == 1){
                        m = 12;
                        d = 31;
                        y = year - 1;
                    }
                default:
                    if(day == 31){
                        m = month ;
                        d = 1;
                        y = year;
                    }
                    }
            System.out.println("hôm qua : "+d+" / "+m+" / "+y);           
    }
  
}
