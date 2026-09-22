package Loops;

import java.util.*;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(2, 4);
        List<Integer> b = Arrays.asList(16, 32, 96);
        int l1 = a.size();
        int l2 = b.size();
        int x;
        List<Integer> valueX = new ArrayList<>();
        Set<Integer> valueY = new HashSet<>();
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                x = b.get(j)/a.get(i);
                    valueX.add(x);
            }
        }
        for (int i=0;i<valueX.size();i++){
            boolean valid = true;
            x=valueX.get(i);
            for (int i1=0;i1<l1;i1++){
                if(x%a.get(i1)!=0){
                    valid = false;
                    break;
                }
            }
            for (int i2=0;i2<l2;i2++){
                if(b.get(i2)%x!=0){
                    valid = false;
                    break;
                }
            }
            if(valid){
                valueY.add(x);
            }
        }
        System.out.println(valueY.size());
    }
}
