package ReverseString;

import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
       sb =  sb.reverse();
        System.out.println(sb);
    }
}
