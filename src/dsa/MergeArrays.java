package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeArrays {
    public static void main(String[] args) {
        int [] a =  {1,2,3,0,0,0};
        int [] b =  {2,5,6};
        int m = 3;
        int n = 3;
        int i = m-1;
        int j = n-1;
        int k = a.length;
        if(m<=0){
            a[m]=b[n-1];
        }
        while(i>=0 && j>=0){
            System.out.println("enter");
            if(a[i] < b[j]){
                a[k-1] = b[j];
                j = j-1;
            }
            else{
                a[k-1] = a[i];
                i = i-1;
            }
            k = k-1;
        }
        for (int value : a) {
            System.out.println(value + " ");
        }
        System.out.println(i+" "+j+" "+k);
        while(k>0 && j>0){
            a[k-1] = b[j];
            j = j-1;
            k = k-1;
        }
        for (int value : a) {
            System.out.print(value + " ");
        }

    }

}
