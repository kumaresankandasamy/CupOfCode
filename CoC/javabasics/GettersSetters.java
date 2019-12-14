package interview.javabasics;

public class GettersSetters {
    private String name;
    public void setName(String name){
        //set min name length
        if(name != null && name.length()> 2) {
            this.name = name;
        }
    }
    public String getName(){
        return  name;
    }

    public static void main(String[] args) {
    }
    }


