package interview.javabasics.String;

public class Removecharacter {
    public static String removeChar(String str,char ch){
        if(str == null){
            return null;
        }
        return str.replaceAll(Character.toString(ch),"");
    }
    public static void main(String[] args) {
        System.out.println(Removecharacter.removeChar("ran",'r'));
    }
}
