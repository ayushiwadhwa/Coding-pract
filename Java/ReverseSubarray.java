/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class ReverseSubarray {
    static int[] reverse(int[] arr, int k)
    {
        int n = arr.length;
        
        for(int i = 0; i < n; i+=k)
        {
            int temp;
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            
            while(left < right)
            {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args)
    {
         
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
     
        int n = arr.length;
     
        reverse(arr, k);
     
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
