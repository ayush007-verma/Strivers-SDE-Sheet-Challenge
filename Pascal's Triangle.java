import java.io.*;
import java.util.*;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		if(n <= 0) return ans;
		ArrayList<Long> temp = new ArrayList<>();
		temp.add(1L);
		ans.add(temp);

		for(int i=1; i<n; i++) {
			ArrayList<Long> prev = ans.get(i-1);
			ArrayList<Long> curr = new ArrayList<>();

			curr.add(1L);

			for(int j=1; j<i; j++) {
				long sum = prev.get(j-1) + prev.get(j);
				curr.add(sum);
			}

			curr.add(1L);

			ans.add(curr);
		}
		return ans;
	}
}
