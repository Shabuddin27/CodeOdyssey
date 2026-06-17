package dsa;

import java.util.Arrays;

public class MinimizeHeightsII {
    public static void main(String[] args) {
        int[] arr = {7};
        Arrays.sort(arr);
        int k=100;
        int ans = arr[arr.length-1] - arr[0];
        for (int i=0; i<arr.length-1;i++){
            int minHeight = Math.min(arr[0]+k,arr[i+1]-k);
            int maxHeight = Math.max(arr[i]+k,arr[arr.length-1]-k);

            if(minHeight<0){
                continue;
            }
            ans = Math.min(ans,maxHeight-minHeight);
            System.out.println("After every loop ans is -->"+ans);
        }
        System.out.println(ans);
    }
}
