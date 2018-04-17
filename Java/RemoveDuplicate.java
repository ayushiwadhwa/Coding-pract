
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
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
public class RemoveDuplicate {
    
    static void remvDupl(String str)
    {
        Deque deque = new LinkedList<>();
        //Stack<Character> stck = new Stack<>();
        deque.push(str.charAt(0));
        for(int i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == (char)deque.peek())
            {
                deque.pop();
            }
            else
                deque.push(str.charAt(i));
        }
        if(!deque.isEmpty())
        {
            Iterator iterator = deque.descendingIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next());
 
            
        }
    }
    public static void main(String[] args) {
		
                String str = "geeksforgeeks";
                remvDupl(str);
		
	}
}
