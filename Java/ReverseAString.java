
import java.util.Stack;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class ReverseAString {
    static void reverseStrng(String str)
    {
        
        String[] arr = str.split("\\.");
        for(int i = arr.length -1; i >= 0; i--)
        {
            if(i==0)
            {
                System.out.print(arr[i]);
            }
            else
            System.out.print(arr[i] + ".");
        }
        
    }
    
     public static void main(String[] args)
    {
        String s1 = "Welcome.to.geeksforgeeks";
        reverseStrng(s1);
 
        //String s2 = "I love Java Programming";
        //System.out.println(reverseWords(s2));
    }
}
