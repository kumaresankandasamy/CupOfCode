package interview;

public class Factorial {
    public int factorial(int n){
        if(n < 0){
            return -1;
        }
        else if(n == 0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int num = 5;
        System.out.println(""+obj.factorial(num));

    }

}
