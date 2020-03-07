import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int x = getMaxSet(a, n);
        System.out.println(x);
    }
    
    static int getMaxSet(int arr[], int n){
        Arrays.sort(arr);
        int cnt =0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[j]-arr[i]<=1){
                    cnt++;
                }
            }
            if(cnt>max)
                max=cnt;
            cnt=0;
        }
        return max;
    }
}
