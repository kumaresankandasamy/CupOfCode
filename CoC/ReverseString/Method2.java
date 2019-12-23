package ReverseString;


import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(revString(str));

    }
   static  String revString(String rev){
        if(rev.isEmpty()){
            return rev;
        }
        rev.substring(1);
        return revString(rev.substring(1))+rev.charAt(0);
    }
}
