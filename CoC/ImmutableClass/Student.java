package CoC.ImmutableClass;

import org.omg.Messaging.SyncScopeHelper;

public final class Student {
   final String name;
   final int regNo;
    public Student(String name,int regNo){
        this.name = name;
        this.regNo = regNo;
    }
    public String getName(){
        return name;
    }
    public int getRegNo(){
        return regNo;
    }
}
class Test{
    public static void main(String[] args) {
        Student s = new Student("admin",1);
        System.out.println(s.getName());
        System.out.println(s.getName());
    }
}
