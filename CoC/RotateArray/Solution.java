package RotateArray;

public class Solution {
    public static void main(String[] args) {
     Solution s1 = new Solution();
     int[] arr = {1,2,3,4,5,6,7};
     s1.rotateleft(arr,2,7);
     s1.print(arr,7);
    }
    void rotateleft(int arr[],int d,int n){
    for (int i=0;i<d;i++)
        rotateOneByOne(arr,n);

    }
    void rotateOneByOne(int[] arr,int n){
        int i,temp;
        temp=arr[0];
        for (i=0;i<n-1;i++)
            arr[i]=arr[i+1];
            arr[i] = temp;
    }
    void print(int[] arr,int n){
        for (int i=0;i<n;i++)
        System.out.println(arr[i]+"");
    }
}
