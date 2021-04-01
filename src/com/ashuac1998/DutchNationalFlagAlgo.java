class DutchNationalFlag {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        
        while (high>= mid){
            switch (nums[mid]){
                case 0:
                    swap(nums, mid++, low++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high--);
                    break;
            }
        }
    }
    public int[] swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        return arr;
    }
}
