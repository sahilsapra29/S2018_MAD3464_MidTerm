/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738092_midterm_mads3464;

/**
 *
 * @author macstudent
 */
public class answersecond {
public static int convert(String input){
    Long B1=Long.valueOf(input.)longValue();
    int decimalNumber=0,i=0;
    long remainder;
    while (B1!=0)
    {
        remainder = B1 % 10;
        B1 /=10;
        decimalNumber +=remainder*Math.pow(2, i);
       ++i;   
    }
    return decimalNumber;
}
}
