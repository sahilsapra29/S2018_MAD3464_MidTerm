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
public class LambtonStringTools {
    static int m;
    static int a =0;
    static int res;
    
    static void reverse(String p){
        char ch[]=new char[p.length()];
        for(m=0;m<p.length();m++){
            ch[m]=p.charAt(m);
        }
        for(m=p.length()-3;m>=0;m--){
            System.out.print(ch[m]);
        }
    }
    
}
