class Solution {
    public int maxProfit(int[] prices) {
        
       int max = 0;
       int n = prices.length;
       int l=0,r=0;

       while(r<n){
          if(prices[l]<prices[r]){
            max = Math.max(prices[r]-prices[l], max);
          }
          
          if(prices[l]>prices[r]){
            l = r;
          }
        //   }
        //   while(prices[l] > prices[r]){
        //       l++;
        //   }
          r++;
       }

       return max;

    }
}
