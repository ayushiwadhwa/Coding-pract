
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class firstDuplicate {
  static int firstDuplicatee(int[] a) 
{
    HashSet<Integer> set = new HashSet<Integer>();
int value;
for(int i = 0; i < a.length; i++)
{
    value = a[i];
    if(set.add(value))
    {
        continue;
    }
    else
    {
        return value;
    }
}
    return -1;
}
static char firstNotRepeatingCharacter(String s) {
 boolean[] check = new boolean[128];
 for(int i = 0; i < s.length(); i++)
 {
   int val = s.charAt(i);
   if(check[val])
   {
       s = s.replace(String.valueOf(s.charAt(i)), "");
       //i = 0;
   }
   check[val] = true;
 }
 if(!s.isEmpty())
    return s.charAt(0);
 else
     return '_';
}

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,3};
	int i = firstDuplicatee(a);
        System.out.println(i);
	
        char c = firstNotRepeatingCharacter("abcdefghijklmnopqrstuvwxyziflskecznslkjfabe");
        System.out.println(c);
    }
}

