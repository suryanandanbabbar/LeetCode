package Arrays;
// GfG: Perfect Sum Problem
// Link: https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1

// TC: O(n * target)
// SC: O(target)

public class perfectSum {
    public int perfect(int[] arr, int target) {
        int n=arr.length;
        int[] dp=new int[target+1];
        int[] curr=new int[target+1];
        if(arr[0]==0)dp[0]=2;
        else dp[0]=1;
        if(arr[0]!=0 && arr[0]<=target)dp[arr[0]]=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                int notPick=dp[j];
                int pick=0;
                if(arr[i]<=j)pick=dp[j-arr[i]];
                curr[j]=pick+notPick;
            }
            dp=curr.clone();
        }
        return dp[target];
    }    
}
