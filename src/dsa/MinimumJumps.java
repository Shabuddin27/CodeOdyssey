package dsa;

public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr1={2,5,3,2,3,1,5};
        int[] arr = {10, 9, 10, 5, 3, 2, 4, 5, 8, 9, 7, 4, 2, 5, 6, 3, 5, 7, 1, 10, 9, 4, 10};
        int jumps = minJump(arr);
        System.out.println("Minimum jumps needed "+jumps);
    }
    static int minJump(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return 0;
        }
        if (arr[0]<=0) {
            return -1;
        }
        int jumps = 0;
        for (int i = 0; i < n;) {
            int max = Integer.MIN_VALUE;
            int tempI=0;
            jumps++;
            for (int j = i + 1; j <= i + arr[i] && j < n; j++) {
                int khatam =  i + arr[i];
                if(i+arr[i]>=n-1){
                    return jumps;}
                if (arr[j]+j >= max) {
                    tempI=j;
                    max = arr[j]+j;
                    System.out.println("max uthao "+max);
                }
                if (arr[j] + j >= n - 1 ) {
                    jumps++;
                    return jumps;
                }
            }
            i=tempI;
            System.out.println("my tempI "+i);
        }
        return -1;
    }
}