package CoC;

 class Foo {
    private String attribute;
    public Foo(String a){
        this.attribute = a;
    }
    public void setAttribute(String attribute){
        this.attribute = attribute;
    }
    public String getAttribute(){
        return attribute;
    }
 }
public class PassByValue{
    public static void main(String[] args) {
        Foo f = new Foo("f");
        changeRef(f);
        modifyRef(f);

    }
    public static void changeRef(Foo a){
        Foo b = new Foo("b");
        b = a;

    }
    public static  void modifyRef(Foo c){
        c.setAttribute("c");
    }
}