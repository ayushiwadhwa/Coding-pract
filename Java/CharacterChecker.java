
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
public class CharacterChecker {
    
    static boolean charChecker(char[] exp)
    {
        Stack<Character> stck = new Stack<>();
        for(int i = 0; i < exp.length; i++)
        {
            if(exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
            {
                stck.push(exp[i]);
            }
            if(exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
            {
                if(stck.isEmpty())
                {
                    return false;
                }
                else
                {
                    char ch = stck.pop();
                    if(!(isMatchingPair(ch, exp[i])))
                    {
                        return false;
                    }
                }
            }
        }
        if (stck.isEmpty())
         return true; /*balanced*/
       else
         {   /*not balanced*/
             return false;
         } 
    }
    
    static boolean isMatchingPair(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }
    
    public static void main(String[] args)
    {
        char exp[] = {'{','(',')','}','['};
          if (charChecker(exp))
            System.out.println("Balanced ");
          else
            System.out.println("Not Balanced "); 
    }
}
