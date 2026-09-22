package Loops;

public class NumberLineJumps {
    public static void main(String[] args) {
        int x1=0; int v1=2; int x2=5; int v2=3;
        int maxReach = Integer.MAX_VALUE;
        int c1=0;
        int c2=0;
        boolean flag = false;
        while (!flag){
            x1=x1+v1;
            c1+=1;
            x2=x2+v2;
            c2+=1;

            System.out.println("X1 is "+x1+" and X2 is "+x2+" and C1 is "+c1+" and C2 is "+c2);
            if(x1==x2 && c1==c2){
                flag=true;
                break;
            }
            if(Math.abs(x1-x2)<10){
                flag=false;
            }
            else if(Math.abs(x1-x2)>10){
                break;
            }
        }
        if (flag){
            System.out.println("YES");
        } else if (flag==false) {
            System.out.println("NO");
            
        }

    }
}
