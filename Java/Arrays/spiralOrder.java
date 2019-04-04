/*
 * 
Given a matrix of m * n elements (m rows, n columns), return all elements of the matrix in spiral order.
Example:
Given the following matrix:
[
    [ 1, 2, 3 ],
    [ 4, 5, 6 ],
    [ 7, 8, 9 ]
]
You should return
[1, 2, 3, 6, 9, 8, 7, 4, 5]
 * 
 */

package arrays;

import java.util.*;

public class spiralOrder {
	
	public static ArrayList<Integer> spiralOrderTraversal(ArrayList<ArrayList<Integer>> arr) {
		int rows = arr.size();
		int cols = arr.get(0).size();
		int left = 0, right = cols - 1, top = 0, bottom = rows - 1, flag = 0;
		int i = 0, j = 0;
		ArrayList<Integer> res = new ArrayList<Integer>();
		while (left <= right && top <= bottom) {
			if (flag == 0) {
				// Process the Topmost Row, left->right
				j = left;
				while (j <= right) {
					res.add(arr.get(top).get(j));
					j++;
				}
				// Update the top
				top++;
			}
			else if (flag == 1) {
				// Process the Right most column, top->bottom
				i = top;
				while (i <= bottom) {
					res.add(arr.get(i).get(right));
					i++;
				}
				// Update the right
				right--;
			}			
			else if (flag == 2) {
				// Process the Bottom most row, right->left
				j = right;
				while (j >= left) {
					res.add(arr.get(bottom).get(j));
					j--;
				}
				// Update the bottom
				bottom--;
			}			
			else if (flag == 3) {
				// Process the left most column, bottom->top
				i = bottom;
				while (i >= top) {
					res.add(arr.get(i).get(left));
					i--;;
				}
				// Update the left
				left++;
			}	
			// Update the flag for next iteration
			flag = (flag + 1) % 4;
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ret;		
		
		arr.add(new ArrayList<Integer>());
		arr.add(new ArrayList<Integer>());
		arr.add(new ArrayList<Integer>());
		arr.get(0).add(1);
		arr.get(0).add(2);
		arr.get(0).add(3);
		arr.get(1).add(4);
		arr.get(1).add(5);
		arr.get(1).add(6);		
		arr.get(2).add(7);
		arr.get(2).add(8);
		arr.get(2).add(9);	
		
		ret = spiralOrderTraversal(arr);
		System.out.println(ret);
	}

}
