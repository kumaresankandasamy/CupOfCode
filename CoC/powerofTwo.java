public class powerofTwo {
    public static int power(int n){
        if(n < 1){
            return 0;
        }
        else if(n==1){
            return 1;
        }else {
            int prev = power(n/2);
            int cur = prev * 2;
         System.out.println(""+cur);
          return cur;
        }
    }
    public static void main(String[] args) {

       System.out.println(power(50));
    }
}
