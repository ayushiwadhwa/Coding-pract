
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//outer:                   should be placed exactly before the loop
//loopingConstructOne  {   we can have statements before the outer but not inbetween the label and the loop          
//    inner:
//    loopingConstructTwo {
//        continue;       //goes to the top of loopingConstructTwo and continue
//        break;          //breaks out of loopingConstructTwo
//        continue outer; //goes to the outer label and reenters loopingConstructOne
//        break outer;    //breaks out of the loopingConstructOne
//        continue inner; //this will behave similar to continue
//    }
//}
/**
 *
 * @author ayushiwadhwa
 */
public class TwoCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        int maxPattern = 0;
        
        if(s.length() == 1)//Edge case where length is 1
        {
            System.out.println(maxPattern);
            System.exit(0);
        }
        
        //Loop through all letter pairs
        for(int i = 0; i < 26; i++)
        {
            nextLetter:
            for(int j = i + 1; j < 26; j++)
            {
                char one = (char) ('a' + i); //First char in pair
                char two = (char) ('a' + j); //Second char in pair
                char lastSeen = '\u0000';
                int patternLength = 0;
                
                for(char letter : s.toCharArray())
                {
                    if(letter == one || letter == two)
                    {
                        if(letter == lastSeen)//Duplicate found
                        {
                            continue nextLetter;
                        }
                        //Not a duplicate
                        patternLength++;
                        lastSeen = letter;
                    }
                }//for char : s
                
                maxPattern = patternLength > maxPattern ? patternLength : maxPattern; //Keep a running max
                
            }//for j
        }//for i
        
        System.out.println(maxPattern);
        
    }
}
