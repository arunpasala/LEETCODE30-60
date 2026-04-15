class Solution {
public int[] productOfArrayExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        // Calculate the product of all elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct;
            leftProduct *= nums[i];
        }   
        // Calculate the product of all elements to the right of each index
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= rightProduct;
            rightProduct *= nums[i];
        }   
        return answer;  
        
}
}



