public class Max {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int small = arr[0];
        int largest = arr[0];
        int avg =0;
        int sum =0;
        for(int i=1;i<arr.length;i++){
             sum = sum+arr[i];
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < small){
                small = arr[i];
            }
            avg = sum/arr.length;
        }
        System.out.println("largetst "+largest);
        System.out.println("smallest "+small);
        System.out.println("avg "+avg);

    }
}
