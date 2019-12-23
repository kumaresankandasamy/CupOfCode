package ReverseArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the elements");
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("reverse array");
        for (int i=n-1;i>=0;i--){
            System.out.println(""+arr[i]);
        }

    }
}
