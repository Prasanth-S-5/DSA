class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;

        int pref[] = new int[n];
        int suf[] = new int[n];
        
        pref[0] = nums[0];
        suf[n-1] = nums[n-1];

        for(int i=1,j=n-2;i<n && j>-1;i++,j--){
            pref[i] = pref[i-1] * nums[i];
            suf[j] = suf[j+1] *  nums[j];
        }
        
        // System.out.println(Arrays.toString(pref)+"\n"+Arrays.toString(suf));
        // nums[0] = suf[0];
        // nums[n-1] = pref[n-1];

        for(int i=0;i<n;i++){
            nums[i] = (( i-1 >=0) ? pref[i-1] : 1) * (( i+1 <n) ? suf[i+1] : 1);
        }

        return nums;
    }
}
