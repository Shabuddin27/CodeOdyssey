package dsa;

public class KadaneAlgorithm {
    public static void main(String[] args){
        int[] arr={-2,-100};
         int sum=arr[0];
         int max=arr[0];
         for(int i=1;i<arr.length;i++){
             sum =Math.max(arr[i],sum+arr[i]);
             max =Math.max(sum,max);
         }
        System.out.println(max);
            }
}
