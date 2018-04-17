/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class LeaderArray {
    //O(n^2)
    static void getLeader(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            int j;
            for( j = i + 1; j < arr.length; j++)
            {
                if(arr[j] >= arr[i])
                {
                    break;
                }
            }
            if (j == arr.length) // the loop didn't break
                System.out.print(arr[i] + " ");
        }
    }
    
    //O(n)
    static void getLeaderfromRight(int[] arr)
    {
        int size = arr.length;
        int max_from_right = arr[size - 1];
        System.out.println(max_from_right + " ");
        for(int i = size - 2; i>=0; i--)
        {
            if(max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.println(max_from_right + " ");
            }
        }
    }
    public static void main(String[] args) 
    {
        //LeadersInArray lead = new LeadersInArray();
        int arr[] = new int[]{16, 17, 4, 3, 5, 2};
        int n = arr.length;
        //getLeader(arr);
        getLeaderfromRight(arr);
    }

}
