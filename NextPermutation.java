import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> per) 
	{
		// Write your code here.

		int i = per.size() - 1;
		
		while(i > 0 && per.get(i-1) >= per.get(i)) {
			i -= 1;
		} // finding pivot
		
		if(i == 0) { // pivot not found
			// reverse the sequence
			int start = i;
			int end = per.size()-1;

			while(start <= end) {
				if(start == end) break;
				// swap start and end
				int temp = per.get(start);
				per.set(start, per.get(end));
				per.set(end, temp);

				start += 1;
				end -= 1;
			}
		} else {
			// found pivot
			int pivot = i-1;
			
			// find smallest number greater than pivot towards its right

			int mini = Integer.MAX_VALUE;
			int smal_index = -1;
			
			for(int j=i; j<per.size(); j++) { // towards right of pivot
				if(mini > per.get(j) && per.get(j) > per.get(pivot)) {
					mini = per.get(j);
					smal_index = j;
				}	
			}

			// swap pivot and smal_index
			int temp = per.get(pivot);
			per.set(pivot, per.get(smal_index));
			per.set(smal_index, temp);
			
			// reverse the sequence towards right of pivot

			int start = i;
			int end = per.size()-1;

			while(start <= end) {
				if(start == end) break;
				// swap start and end
				temp = per.get(start);
				per.set(start, per.get(end));
				per.set(end, temp);

				start += 1;
				end -= 1;
			}
		}
		return per;
	}
}
