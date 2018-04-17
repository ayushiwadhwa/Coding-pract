
import java.util.Deque;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ayushiwadhwa
 */
public class MaxOfSubarrayOfSizeK {
    static void maxSubarray(int[] arr, int k)
    {
        int n = arr.length;
        for(int i =0; i<= n-k; i++)
        {
            int max = arr[i];
            for(int j =  1; j < k; j++)
                if(max < arr[i+j])
                {
                    max = arr[i+j];
                }
            System.out.print(max + " ");
        }
    }
    
    static void printMax(int arr[],int n, int k)
    {
        // Create a Double Ended Queue, Qi that will store indexes of array elements
        // The queue will store indexes of useful elements in every window and it will
        // maintain decreasing order of values from front to rear in Qi, i.e., 
        // arr[Qi.front[]] to arr[Qi.rear()] are sorted in decreasing order
        Deque<Integer> Qi = new LinkedList<Integer>();
         
        /* Process first k (or first window) elements of array */
        int i;
        for(i = 0; i < k; ++i)
        {
            // For very element, the previous smaller elements are useless so
            // remove them from Qi
            while(!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();   // Remove from rear
             
            // Add new element at rear of queue
            Qi.addLast(i);
        }
         
        // Process rest of the elements, i.e., from arr[k] to arr[n-1]
        for( ;i < n; ++i)
        {
            // The element at the front of the queue is the largest element of
            // previous window, so print it
            System.out.print(arr[Qi.peek()] + " ");
             
            // Remove the elements which are out of this window
            while((!Qi.isEmpty()) && Qi.peek() <= i-k)
                Qi.removeFirst();
             
            // Remove all elements smaller than the currently
            // being added element (remove useless elements)
            while((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()])
                Qi.removeLast();
             
 
            // Add current element at the rear of Qi
            Qi.addLast(i);
             
        }
         
        // Print the maximum element of last window
        System.out.print(arr[Qi.peek()]);
    }
     
    // Driver program to test above functions
        public static void main(String args[]) 
    {
        int arr[]={12, 1, 78, 90, 57, 89, 56};
        int k=3;
        maxSubarray(arr, k);
        System.out.println();
        printMax(arr, arr.length,k);
        System.out.println();
    }
}
