
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class anagrams {
    public static boolean isAnagram(String strA, String strB){
        HashMap<Character, Integer> aCharMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> bCharMap = new HashMap<Character, Integer>();
        aCharMap = buildCharMap(strA);
        bCharMap = buildCharMap(strB);
        if(aCharMap.size() != bCharMap.size()){
            return false;
        }
        if(!(aCharMap.keySet().equals(bCharMap.keySet()))){
            return false;
        }
        return true;
    }
    
    public static HashMap<Character, Integer> buildCharMap(String str){
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        HashMap<Character, Integer> CharMap = new HashMap<Character, Integer>();
        for(int i = 0; i < cleanedStr.length(); i++){
            if(CharMap.containsKey(cleanedStr.charAt(i))){
                int charCount = CharMap.get(cleanedStr.charAt(i));
                CharMap.put(cleanedStr.charAt(i), ++charCount);
            }
            else{
                CharMap.put(cleanedStr.charAt(i), 1);
            }
        }
        return CharMap;
    }
    public static void main(String[] args)
    {
        System.out.println(isAnagram("Mother In Law", "Hitler Woman"));
 
        System.out.println(isAnagram("keEp", "peeK"));
 
        System.out.println(isAnagram("SiLeNt CAT", "LisTen AcT"));
 
        System.out.println(isAnagram("Debit Card", "Bad Credit"));
 
        System.out.println(isAnagram("School MASTER", "The ClassROOM"));
 
        System.out.println(isAnagram("DORMITORY", "Dirty Room"));
 
        System.out.println(isAnagram("ASTRONOMERS", "NO MORE STARS"));
 
        System.out.println(isAnagram("Toss", "Shot"));
 
        System.out.println(isAnagram("joy", "enjoy"));
    }
}
