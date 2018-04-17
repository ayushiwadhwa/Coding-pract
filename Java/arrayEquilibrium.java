/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class arrayEquilibrium {
    
static int equilibrium(int arr[], int n) 
    {
        int i, j;
        int leftsum, rightsum;
 
        for (i = 0; i < n; i++) 
        {
            leftsum = rightsum = 0;
            for(j = 0; j < i; j++)
                leftsum += arr[j];
            for(j = i + 1; j < n; j++)
                rightsum += arr[j];
            if(leftsum == rightsum)
                return i;
        }
 
        /* return -1 if no equilibrium index is found */
        return -1;
    }
 
    public static void main(String[] args) 
    {
        //EquilibriumIndex equi = new EquilibriumIndex();
        int arr[] = {2,2,0,5,0,1,3};
        int arr_size = arr.length;
        System.out.println(equilibrium(arr, arr_size));
    }
}
