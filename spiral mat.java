class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0;
        int btm = m-1;
        int left = 0;
        int right = n-1;
        
        while(ans.size()<m*n){
          
           for(int i=left;i<=right && ans.size()<m*n;i++){
             ans.add(matrix[top][i]);
           }
           top++;

           for(int i=top;i<=btm && ans.size()<m*n;i++){
             ans.add(matrix[i][right]);
           }
           right--;

           for(int i=right;i>=left && ans.size()<m*n;i--){
            ans.add(matrix[btm][i]);
           }
           btm--;

           for(int i=btm;i>=top && ans.size()<m*n;i--){
            ans.add(matrix[i][left]);
           }
           left++;

        }

        return ans;
    }
}
