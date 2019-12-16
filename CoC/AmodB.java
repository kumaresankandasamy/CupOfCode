package CoC;

public class AmodB {
    public static int mod(int a,int b){
        if(b<=0){
            return -1;
        }else{
            int div = a/b;
            return a-div*b;
        }
    }
    public static void main(String[] args) {
     System.out.println(mod(2,0));
     System.out.println(mod(2,2));
        
    }
}
