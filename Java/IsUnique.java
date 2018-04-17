/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class IsUnique {
    public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
    public static boolean isUniqueCharsOneDS(String str) {
		if (str.length() > 128) {
			return false;
		}
		for(int i = 0; i < str.length(); i++)
                {
                    for (int j = i + 1; j < str.length(); j++)
                    {
                        char c = str.charAt(i);
                        char d = str.charAt(j);
                        
                        if(c == d)
                        {
                            return false;
                        }
                    }
                }
                return true;
	}
	
	public static void main(String[] args) {
		String[] words = {" abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUniqueChars(word));
		}
                for (String word : words) {
			System.out.println(word + ": " + isUniqueCharsOneDS(word));
		}
	}
    
}
