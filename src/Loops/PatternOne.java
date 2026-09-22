package Loops;
//            *
//            **
//            ***
//            ****
//            *****

//        *****
//        ****
//        ***
//        **
//        *
public class PatternOne {
    public static void main(String args[]) {
            int n=6;
            for(int r = 0; r < n; r ++){
                for(int s = 0; s < n-1-r; s++){
                    System.out.print(" ");
                }
                for(int c=0; c<=r; c ++){
                    System.out.print("#");
                }
                System.out.println();
            }

    }}