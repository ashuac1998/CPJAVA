class Kadane {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        
        for (int point : nums){
            
            sum += point;
            maxi = Math.max(sum, maxi);
            
            if (sum < 0){
                sum = 0;
            }
        }
        
        return maxi;
        
                
    }

}
