
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class SuperReducedString {
    static String super_reduced_string(String s){
        // Complete this function
        StringBuilder result = new StringBuilder();
        Stack<Character> stck = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(!stck.isEmpty() && s.charAt(i) == stck.peek())
            {
                stck.pop();
            }
            else
            {
                stck.push(s.charAt(i));
            }
        }
        if (stck.isEmpty()) {
            return "Empty String";
        } else {
            for (char ch : stck) {
                result.append(Character.toString(ch));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
