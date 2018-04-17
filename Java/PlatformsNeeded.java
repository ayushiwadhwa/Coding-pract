
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class PlatformsNeeded {
    
    static int getPlatforms(int[] arr, int[] dep)
    {
        int platNeeded = 1;
        int result = 1;
        int i = 1;
        int j = 0;
        int n = arr.length;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        while(i<n && j<n)
        {
            if(arr[i] < dep[j])
            {
                platNeeded++;
                i++;
                
                if(platNeeded > result)
                    result = platNeeded;
            }
            else
            {
                platNeeded--;
                j++;
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {900,940,950,1100,1500,1800};
        int[] dep = {910,1200,1120,1130,1900,2000};
        int platformsNeeded = getPlatforms(arr,dep);
        System.out.println(platformsNeeded);
    }
    
}
