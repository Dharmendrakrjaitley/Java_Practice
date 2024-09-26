package practice;

//1. Given two string in json format. Return all keys in json, which are present in both strings but have different value.
//
//Input : s1 – {“a”:”d”, “e”:”r”}
//
//s2 = {“a”:”c”, “e”:”r”, “K”:”s”}
//
//Output : “a”

public class TestQuestion {

		    // Function to find the maximum sum of a contiguous subarray using Kadane's Algorithm
		    public static int maxSubArraySum(int[] nums) {
		        // Initialize variables
		        int maxSoFar = nums[0];  // Stores the overall maximum sum
		        int maxEndingHere = nums[0];  // Stores the maximum sum of the subarray ending at the current index

		        // Traverse through the array starting from the second element
		        for (int i = 1; i < nums.length; i++) {
		            // Update maxEndingHere: either the current element itself or extend the previous subarray
		            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);

		            // Update maxSoFar: keep track of the overall maximum sum found so far
		            maxSoFar = Math.max(maxSoFar, maxEndingHere);
		        }
		        

		        // Return the maximum sum
		        return maxSoFar;
		    }

		    public static void main(String[] args) {
		        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		        System.out.println("Maximum Sum of Contiguous Subarray: " + maxSubArraySum(nums));
		    }
		}

	

