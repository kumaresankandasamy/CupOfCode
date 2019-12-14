package interview.javabasics.String;

public class Palidrome1 {
    public static boolean isPalidrome (String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(str);

    }
    public static void main(String[] args) {


        System.out.println( Palidrome1.isPalidrome("ram"));
        System.out.println( Palidrome1.isPalidrome("madam"));

    }
}