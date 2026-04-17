public class increasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= first) {
                first = num; // Update the smallest number
            } else if (num <= second) {
                second = num; // Update the second smallest number
            } else {
                return true; // Found a triplet: first < second < num
            }
        }
        
        return false; // No triplet found
    }   
    
}
