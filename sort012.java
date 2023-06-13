import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while(mid <= high) {
            if(arr[mid] == 1) {
                mid += 1;
            } else if(arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low += 1;
                mid += 1;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;

                high -= 1;
            }
        }
        
    }
}
