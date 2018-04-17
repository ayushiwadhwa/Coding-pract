/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class missingNumber {
    
    static int getMissingNumber(int[] arr)
    {
        if(arr[0] != 1)
        {
            return 1;
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(i == arr.length - 1)
            {
                return arr[i] + 1;
            }
            else if (arr[i+1] != arr[i] + 1)
            {
                return arr[i] + 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
	int i = getMissingNumber(a);
        System.out.println(i);
	
    }
    
}
