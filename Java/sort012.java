/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class sort012 {
    
    static void sort012arr(int[] arr)
    {
        int lo,mid,temp;
        lo = mid = temp = 0;
        int hi = arr.length - 1;
        while(mid <= hi)
        {
            switch(arr[mid])
            {
                case 0:
                {
                    temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;     
                }
                case 2:
                {
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                }
            }
        }
        
    }
    public static void main(String[] args)
    {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        //int arr_size = arr.length;
        sort012arr(arr);
        System.out.println("Array after seggregation ");
        printArray(arr);
    }
    static void printArray(int arr[])
    {
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
    }
}
