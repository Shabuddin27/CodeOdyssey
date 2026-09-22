package dsa;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a caR";
        String s1="";
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90 ||
                    s.charAt(i)>=97 && s.charAt(i)<=122 ||
                    s.charAt(i)>='0' && s.charAt(i)<='9'){
                s1+=s.charAt(i);
            }
        }
        s1=s1.toLowerCase();
        int j=0;
        boolean flag = true;
        for (int i=s1.length()-1;i>=0;i--){
            if(s1.charAt(i)!=s1.charAt(j)){
                flag = false;
            }
                j++;
        }
        if(flag){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
