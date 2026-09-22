package Loops;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class miniMaxSum {

    public static void main(String args[]){
        int arr[] = {7, 69, 2, 221, 8974};
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        for( int i = 0; i < n; i++){
        int sum = 0;
            for (int j=0; j < n; j++){
                if(arr[i]!=arr[j]){
                    sum += arr[j];
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println("sum is "+sum);
            list.add(sum);
            Arrays.sort(list.toArray());
        }
        for(int j=0; j<n; j++){
            System.out.println("list is "+list.get(j));
        }
        System.out.print(list.get(0)+" "+list.get(n-1));
    }
}
