package dsa;

public class KadaneAlgorithm {
    public static void main(String[] args){
        int[] arr={1, 2, 3, -2, 5};
        int sum = arr[0];
        int best = arr[0];
        for(int i=1;i<arr.length;i++){
            sum = Integer.max(arr[i],sum+arr[i]);
            best = Integer.max(best,sum);
            System.out.println("sum is --> "+sum+" "+"best is --> "+best);
        }
        System.out.println(best);
            }
}
